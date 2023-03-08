package com.springboot.board.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.board.model.LecMember;

@Repository
public interface LecMemberRepository extends CrudRepository<LecMember, Integer>{
	LecMember save(LecMember lecMember);

}
