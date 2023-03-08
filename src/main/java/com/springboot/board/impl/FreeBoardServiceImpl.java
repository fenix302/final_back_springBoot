package com.springboot.board.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.board.model.FreeBoard;
import com.springboot.board.repository.FreeBoardRepository;


@Service("freeBoardService")
public class FreeBoardServiceImpl implements FreeBoardService {
	
	@Autowired
	private FreeBoardRepository dao;
	
	public void insert(FreeBoard freeBoard) {
		dao.save(freeBoard);
	}
	
	public void update(FreeBoard freeBoard) {
		FreeBoard currFreeBoard = dao.findTopByOrderByBnoDesc();
		currFreeBoard.setBno(freeBoard.getBno());
		currFreeBoard.setContent(freeBoard.getContent());
		currFreeBoard.setWriter(freeBoard.getWriter());
		dao.save(currFreeBoard);
	}
	
	public void delete(FreeBoard freeBoard) {
		dao.delete(freeBoard);
	}
	
	public FreeBoard select() {
		return dao.findTopByOrderByBnoDesc();
		
	}	
}