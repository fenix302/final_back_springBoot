package com.springboot.board.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name= "TB_LECTURE")
public class Lecture {
	@Id
	@GeneratedValue
	@Column(name="BNO")
	private Long bno;
	
	@Column(name="LECTURETYPE")
	private String lectureType;
	
	@Column(name="TEACHER")
	private String teacher;
	
	@Column(name="LECTUREROOM")
	private Long lectureRoom;
	
	@Column(name="STUDENTNUM")
	private Long studentNum;
	
	@Column(name="LECTUREPRICE")
	private Long lecturePrice;
	
}
