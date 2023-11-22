package com.learnSphere.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.learnSphere.entity.Users;
import com.learnSphere.service.UserService;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/nav")
public class LsController {
	
	UserService us;
	public LsController(UserService us) {
		super();
		this.us = us;
	}
	@GetMapping("/home")
	public String homePage()
	{
		return "/html/index";
	}

	@GetMapping("/login")
	public String loginToLs()
	{
		return "/html/login";
	}
	
	@GetMapping("/register")
	public String registerToLs()
	{
			return "/html/register";
	}
	
	@PostMapping("/adduser")
	public String adduserToLs(
			@RequestParam("name") String name,
			@RequestParam("email") String email,
			@RequestParam("password") String password,
			@RequestParam("role") String role)
	{
		boolean emailExists=us.chechemail(email);
		if(emailExists==false)
		{
			Users user=new Users();
			user.setName(name);
			user.setEmail(email);
			user.setPassword(password);
			user.setRole(role);
			us.addUser(user);
			
			System.out.println("User Registred Successfully");
			return "redirect:/nav/home";
		}
		else
		{
			System.out.println("User Already Exists!..");
			return "/html/registerfail";
		}
	
	}
	
	@PostMapping("/validate")
	public String validate(@RequestParam("email") String email,
			@RequestParam("password") String password,
			HttpSession session)
	{
		if(us.chechemail(email))
		{
			boolean val=us.validate(email,password);
			if(val==true)
			{
				Users user=us.getUser(email);
				session.setAttribute("loggedInUser", user);
				if(us.UserRole(email).equals("trainer"))
				{
					return "/html/trainerhome";
				}
				else
				{
					return "/html/studenthome";
				}
			}
			else
			{
				System.out.println("Incorrect Credentials, try again");
				return "/html/loginfail";
			}	
		}
		else
		{
			return "/html/loginfail";
		}
	}
	
	@GetMapping("/createcourse")
	public String createcourseToLs()
	{
			return "/html/createcourse";
	}
	
	@GetMapping("/addlesson")
	public String addlessonToLs()
	{
			return "/html/addlesson";
	}
	
	

}
