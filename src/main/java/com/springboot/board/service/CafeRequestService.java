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
	
	// 글 조회
	public List<CafeRequest> getAllBoard(){
		return requestRepository.findAll();
	}

	// 글 삭제
	public CafeRequest createBoard(CafeRequest board) {
		return requestRepository.save(board);
	}

	// 글 번호를 이용한 상세조회 기능
	public ResponseEntity<CafeRequest> getBoard(Integer bno) {
		CafeRequest board = requestRepository.findById(bno).orElseThrow(() -> new IllegalArgumentException("존재하지 않는 데이터입니다."));
		return ResponseEntity.ok(board);
	}

	// 글 번호를 이용한 수정 기능
	public ResponseEntity<CafeRequest> updateBoard(Integer bno, CafeRequest updateBoard) {
		CafeRequest board = requestRepository.findById(bno).orElseThrow(() -> new IllegalArgumentException("존재하지 않는 데이터입니다."));
		board.setTitle(updateBoard.getTitle());
		board.setContent(updateBoard.getContent());
		board.setWriter(updateBoard.getWriter());
		
		CafeRequest endUpdateBoard = requestRepository.save(board);
		return ResponseEntity.ok(endUpdateBoard);
	}

	// 글 번호를 이용한 삭제 기능
	public ResponseEntity<Map<String, Boolean>> deleteBoard(Integer bno) {
		CafeRequest board = requestRepository.findById(bno).orElseThrow(() -> new IllegalArgumentException("존재하지 않는 데이터입니다."));
		requestRepository.delete(board);
		Map<String, Boolean> response = new HashMap<>();
		response.put("Deleted Board Data by id : ["+bno+"]", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}
}
