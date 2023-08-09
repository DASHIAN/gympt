package com.lec.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Likes {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int l_seq;
	
	@ManyToOne
	private Community community;
	
	@ManyToOne
	private Member member;
}
