package com.springboot.board.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "tb_lec_Member")
public class LecMember {
	
	@Id
	@GeneratedValue
	@Column(name = "BNO")
	private Long bno;
	
	@Column(name = "LECTURE_NAME")
	private String name;
	
	@Column(name = "LECTURE_EMAIL")
	private String email;
	
	@Column(name = "LECTURE_ADDRESS")
	private String address;
	
	@Column(name = "LECTURE_TEL")
	private String tel;
	
}
