package com.springboot.board.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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

	public ResponseEntity<CafeRequest> getBoard(Integer bno) {
		CafeRequest board = requestRepository.findById(bno).orElseThrow(() -> new IllegalArgumentException("Not exist Board Data by bno : ["+bno+"]"));
		return ResponseEntity.ok(board);
	}

	public ResponseEntity<CafeRequest> updateBoard(Integer bno, CafeRequest updateBoard) {
		CafeRequest board = requestRepository.findById(bno).orElseThrow(() -> new IllegalArgumentException("Not exist Board Data by bno : ["+bno+"]"));
		board.setTitle(updateBoard.getTitle());
		board.setContent(updateBoard.getContent());
		board.setWriter(updateBoard.getWriter());
		
		CafeRequest endUpdateBoard = requestRepository.save(board);
		return ResponseEntity.ok(endUpdateBoard);
	}

	public ResponseEntity<Map<String, Boolean>> deleteBoard(Integer bno) {
		CafeRequest board = requestRepository.findById(bno).orElseThrow(() -> new IllegalArgumentException("Not exist Board Data by bno : ["+bno+"]"));
		requestRepository.delete(board);
		Map<String, Boolean> response = new HashMap<>();
		response.put("Deleted Board Data by id : ["+bno+"]", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}
}
