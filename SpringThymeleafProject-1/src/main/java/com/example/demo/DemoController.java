package com.example.demo;



import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class DemoController {
	
	@GetMapping("/gettime")
	public String showTime(Model theModel)
	{
		Date date=new Date();
		theModel.addAttribute("thedateandtime",date);
		return "time";
	}

}
