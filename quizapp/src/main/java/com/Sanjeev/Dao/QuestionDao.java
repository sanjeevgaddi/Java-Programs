package com.Sanjeev.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Sanjeev.Entity.Questions;

public interface QuestionDao extends JpaRepository<Questions, Integer> {

	

}
