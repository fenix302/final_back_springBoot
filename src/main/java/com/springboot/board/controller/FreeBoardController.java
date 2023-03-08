package com.springboot.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.board.impl.FreeBoardService;
import com.springboot.board.model.FreeBoard;


@CrossOrigin
@RestController
public class FreeBoardController {
	@Autowired
	private FreeBoardService freeBoardService;

	@RequestMapping(value = "insertProcess.do")
	public void insertProcess(FreeBoard freeBoard) {
		freeBoardService.insert(freeBoard);
	}

	@RequestMapping(value = "updateProcess.do")
	public void updateProcess(FreeBoard freeBoard) {
		freeBoardService.update(freeBoard);
	}

	@RequestMapping(value = "deleteProcess.do")
	public void deleteProcess(FreeBoard freeBoard) {
		freeBoardService.delete(freeBoard);
	}

	@RequestMapping(value = "view.do")
	public FreeBoard viewFreeBoard() {
		FreeBoard freeBoard = freeBoardService.select();
		return freeBoard;
	}

}