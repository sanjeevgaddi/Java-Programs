package com.Sanjeev.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Sanjeev.Entity.Questions;
import com.Sanjeev.Service.QuestionService;

@RestController
@RequestMapping("/question")
public class QuestionController {
	@Autowired
	QuestionService qs;
	
	@GetMapping("/allquestions")
	public List<Questions>  getAllQuestions()
	{
		return qs.getAllQuestions();
	}
	

}
