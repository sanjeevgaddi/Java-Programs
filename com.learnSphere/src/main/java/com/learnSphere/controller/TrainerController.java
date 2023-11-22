package com.learnSphere.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.learnSphere.entity.Course;
import com.learnSphere.entity.Lesson;
import com.learnSphere.entity.Users;
import com.learnSphere.service.TrainerService;
import com.learnSphere.service.UserService;

import jakarta.servlet.http.HttpSession;

@Controller
public class TrainerController {
	
	TrainerService ts;
	@Autowired
	public TrainerController(TrainerService ts) {
		super();
		this.ts = ts;
	}
	UserService us;
	@Autowired
	public TrainerController(UserService us) {
		super();
		this.us = us;
	}
	@PostMapping("/addcourse")
	public String addCourse(
			@RequestParam("courseid") int courseid,
			@RequestParam("coursename") String coursename,
			@RequestParam("courseprice") int courseprice)
	{
		Course course=new Course();
		course.setCourse_id(courseid);
		course.setCourse_name(coursename);
		course.setCourse_price(courseprice);
		
		Course c=ts.addCourse(course);
		if(c!=null)
		{
			return "/html/trainerhome";
		}
		else
		{
			return "/html/createcoursefail";
		}
		
	}
	
	@PostMapping("/addlesson")
	public String addlesson(
			@RequestParam("courseid") int courseid,
			@RequestParam("lessonid") int lessonid,
			@RequestParam("lessonname") String lessonname,
			@RequestParam("lessontopic") String lessontopic,
			@RequestParam("videolink") String videolink)
	{
		Course course=ts.getCourse(courseid);
		Lesson lesson=new Lesson(lessonid,lessonname,lessontopic,videolink,course);
		
		ts.addLesson(lesson);
		course.getLessons().add(lesson);
		ts.saveCourse(course);
		
		return "/html/trainerhome";
	}
	
	@GetMapping("/showcourse")
	public String showcourseToLs(Model theModel)
	{
		List<Course>  courselist=ts.courseList();
		theModel.addAttribute("courselist",courselist);
			return "/html/showcourse";
	}
	
	@GetMapping("/purchase")
	public String showcourses(Model  theModel,HttpSession session)
	{
		Object user= session.getAttribute("loggedInUser");
		
		List<Course> courselist=ts.courseList();
		theModel.addAttribute("courselist",courselist);
		theModel.addAttribute("loggedInUser",user);
		return  "/html/purchase";
		
	}
	
	@GetMapping("/fetchCourses")

	public String fetchCourses(Model model, HttpSession session) {

	Users loggedUser=(Users) session.getAttribute("loggedInUser");

	String email=loggedUser.getEmail();

	Users user=us.getUser(email);

	List<Course> courseList=user.getCourses();

	model.addAttribute("courseList",courseList);

	return "/html/myCourses";

	}


}
