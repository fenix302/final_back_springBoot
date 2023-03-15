package com.springboot.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.board.model.CafeRequest;
import com.springboot.board.service.CafeRequestService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/cafe")
public class CafeRequestController {

	@Autowired
	private CafeRequestService caferequestSerivce;
	
	@GetMapping("/board")
	public List<CafeRequest> getAllBoards(){
		
		return caferequestSerivce.getAllBoard();
	}
}