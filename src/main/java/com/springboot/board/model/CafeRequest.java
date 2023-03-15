package com.springboot.board.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import lombok.Data;

@SequenceGenerator(
		name = "seq_cafe_request",
		sequenceName = "seq_request",
		initialValue = 1,
		allocationSize = 1)
@Data
@Entity
@Table(name = "TB_CAFE_REQUEST")
@DynamicInsert
@DynamicUpdate
public class CafeRequest {
	
	@Id
	@GeneratedValue(
			strategy=GenerationType.SEQUENCE,
			generator="seq_cafe_request"        
			)
	
	@Column(name = "BNO")
	private Long bno;
	
	@Column(name = "TITLE")
	private String title;
	
	@Column(name = "CONTENT")
	private String content;
	
	@Column(name = "WRITER")
	private String writer;
	
	@Column(name = "REGDATE")
	private Date regdate;
	
}
