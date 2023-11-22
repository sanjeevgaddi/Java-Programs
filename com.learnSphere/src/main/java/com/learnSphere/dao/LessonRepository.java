package com.learnSphere.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learnSphere.entity.Course;
import com.learnSphere.entity.Lesson;

public interface LessonRepository extends JpaRepository<Lesson, Integer> {

	void save(Course course);


}
