package com.springboot.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.board.service.LectureService;
import com.springboot.board.model.Lecture;

@RestController
public class LectureController {
	@Autowired
	private LectureService lectureService;
	
	@RequestMapping(value= "selectLecture.do")
	public Lecture viewLecture() {
		Lecture lecture = lectureService.select();
		return lecture;
		
	}
}
