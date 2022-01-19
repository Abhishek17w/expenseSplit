package com.codedecode.demo.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Contribution {
	private String contributionId;
	private String transactionId;
	private String contributionValue;
	private LocalDateTime contributionDate;
	private String transactionDescription;
	
}
