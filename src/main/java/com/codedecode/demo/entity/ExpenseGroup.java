package com.codedecode.demo.entity;

import java.util.Map;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.MapKeyColumn;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ExpenseGroup {
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int expenseGroupId; 
	//private Map<String,UserShare> userShareMap;
	
}
