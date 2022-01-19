package com.codedecode.demo.entity;

import java.time.LocalDateTime;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Expense {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int expenseId;
	
	@ManyToOne( cascade = CascadeType.ALL)
	@JoinColumn( name = "email_id", referencedColumnName = "email" )
	private User expenseCreator;
	
	private LocalDateTime expenseDate;
	private String expenseStatus;
	private int expense;
	
	//@OneToOne( cascade = CascadeType.ALL)
	//@JoinColumn( name = "expenseGroupId", referencedColumnName = "expenseGroup_id" )
	//private ExpenseGroup expenseGroup;
	
}
