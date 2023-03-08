package com.springboot.user.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.Data;

@SequenceGenerator(
        name="MEMBER_SEQ_GEN",
        sequenceName="MEMBER_SEQ",
        initialValue=1,
        allocationSize=1
        )
@Data
@Entity
@Table(name="TB_COM_USER")
public class MemberVO {
	  
	@Id
	@GeneratedValue
	@Column(name = "USER_CODE")
	private String userCode;
	
	@Column(name = "ID")
	private String id;
	
	@Column(name = "PW")
	private String pw;
	
	@Column(name = "EMAIL")
	private String email;
	
	@Column(name = "NAME")
	private String name;
	
	
	
	

}
