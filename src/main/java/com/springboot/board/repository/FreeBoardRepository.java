package com.springboot.board.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.board.model.FreeBoard;



@Repository
public interface FreeBoardRepository extends CrudRepository<FreeBoard, Integer>{
	
	FreeBoard findTopByOrderByBnoDesc();
	
	FreeBoard save(FreeBoard freeBoard);
	
	void delete(FreeBoard freeBoard);
	
}