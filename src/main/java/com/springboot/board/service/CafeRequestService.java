package com.springboot.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.board.model.CafeRequest;
import com.springboot.board.repository.RequestRepository;

@Service
public class CafeRequestService {

	@Autowired
	private RequestRepository requestRepository;
	
	public List<CafeRequest> getAllBoard(){
		return requestRepository.findAll();
	}

	public CafeRequest createBoard(CafeRequest board) {
		return requestRepository.save(board);
	}
}
