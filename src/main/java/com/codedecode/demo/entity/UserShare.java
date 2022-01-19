package com.codedecode.demo.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserShare {
	
	private String userId;
	private int share;
	//private List<Contribution> contributions;
	
	public UserShare(String userId, int share) {
		super();
		this.userId = userId;
		this.share = share;
		//this.contributions = new ArrayList<>();
	}
	
	
}
