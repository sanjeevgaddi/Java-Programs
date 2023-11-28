package com.Sanjeev.Service;

import com.Sanjeev.Dao.QuestionDao;
import com.Sanjeev.Entity.Questions;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionService {
	
	@Autowired
	QuestionDao qd;

	public List<Questions> getAllQuestions() {
		
		return qd.findAll();
		
	}

	

}
