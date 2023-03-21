package com.springboot.board.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.board.model.CafeRequest;
import com.springboot.board.service.CafeRequestService;

// React와 통신하기 위한 어노테이션 지정
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/cafe")
public class CafeRequestController {

	@Autowired
	private CafeRequestService caferequestSerivce;
	
	// 조회 기능
	@GetMapping("/board")
	public List<CafeRequest> getAllBoards(){
		
		return caferequestSerivce.getAllBoard();
	}
	
	// 글 생성 기능
	@PostMapping("/board")
	public CafeRequest createBoard(@RequestBody CafeRequest board) {
		return caferequestSerivce.createBoard(board);
	}
	
	// 글 번호를 통한 글 상세조회 기능
	@GetMapping("/board/{bno}")
	public ResponseEntity<CafeRequest> getBoardByBno(@PathVariable Integer bno){
		return caferequestSerivce.getBoard(bno);
		
	}
	
	// 글 수정 기능
	@PutMapping("/board/{bno}")
	public ResponseEntity<CafeRequest> updateBoardByBno(@PathVariable Integer bno, @RequestBody CafeRequest board){
		return caferequestSerivce.updateBoard(bno, board);
	}
	
	// 글 삭제 기능
	@DeleteMapping("/board/{bno}")
	public ResponseEntity<Map<String, Boolean>> deleteBoardByBno(@PathVariable Integer bno){
		return caferequestSerivce.deleteBoard(bno);
		
	}
}
