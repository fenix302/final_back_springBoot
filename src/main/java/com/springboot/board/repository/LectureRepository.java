package com.springboot.board.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.board.model.Lecture;

@Repository
public interface LectureRepository extends CrudRepository<Lecture, Integer> {
	Lecture save(Lecture lecture);
	Lecture findTopByOrderByBnoDesc();
}
