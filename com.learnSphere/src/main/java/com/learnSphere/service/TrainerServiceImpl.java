package com.learnSphere.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learnSphere.dao.CourseRepository;
import com.learnSphere.dao.LessonRepository;
import com.learnSphere.dao.UserRepository;
import com.learnSphere.entity.Course;
import com.learnSphere.entity.Lesson;
@Service
public class TrainerServiceImpl implements TrainerService{
	@Autowired
	CourseRepository cr;
	@Autowired
	LessonRepository lr;
	@Autowired
	UserRepository ur;

	@Override
	public Course addCourse(Course course) {
		Course c=cr.save(course);
		return c;
	}

	@Override
	public String addLesson(Lesson lesson) {
		lr.save(lesson);
		return "Course added successfuly";
	}

	@Override
	public Course getCourse(int courseId) {
		return  cr.findById(courseId).get();
	
	}

	@Override
	public List<Course> courseList() {
		return cr.findAll();
		 
	}

	@Override
	public String saveCourse(Course course) {
		cr.save(course);
		return "Course added successfuly";
	}



	

}
