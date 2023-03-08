package com.springboot.board.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.board.model.Lecture;
import com.springboot.board.repository.LectureRepository;

@Service("lectureService")
public class LectureServiceImpl implements LectureService {

	@Autowired
	private LectureRepository repo;
	
	@Override
	public Lecture select() {
		return repo.findTopByOrderByBnoDesc();
	}	
}
