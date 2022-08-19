package com.investmentapp.repositary;

import java.util.List;

import com.investmentapp.model.Investment;

public interface IInvestmentRepositary {
	void addInvestment(Investment investment);
	void updateInvestment(int planId,double amount);
	void deleteInvestment(int planIdt);

	List<Investment> findByType(String type);
	List<Investment> findByPurpose(String purpose);
	List<Investment> findByRiskAndTerm(String risk,int term);
	List<Investment> findAll();
	Investment findById(int planId);
}
