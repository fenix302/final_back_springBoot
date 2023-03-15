package com.springboot.board.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.board.model.CafeRequest;

public interface RequestRepository extends JpaRepository<CafeRequest, Integer>{

}
