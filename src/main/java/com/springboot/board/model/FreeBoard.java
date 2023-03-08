package com.springboot.board.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@SequenceGenerator(
        name="Board_SEQ_GEN",
        sequenceName="Board_SEQ",
        initialValue=1,
        allocationSize=1
        )
@Data
@Entity
@Table(name= "tb_gr_free")
public class FreeBoard {
	
	@Id
	@GeneratedValue(
			strategy=GenerationType.SEQUENCE,
			generator="Board_SEQ_GEN"        
			)
	@Column(name = "BNO")
	private Long bno;
	
	@Column(name = "TITLE")
	private String title;
	
	@Column(name = "CONTENT")
	private String content;
	
	@Column(name = "WRITER")
	private String writer;

}
