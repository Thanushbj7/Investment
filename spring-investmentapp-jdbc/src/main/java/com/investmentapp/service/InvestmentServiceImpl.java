package com.investmentapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.investmentapp.model.Investment;
import com.investmentapp.repositary.IInvestmentRepositary;
@Service
public class InvestmentServiceImpl implements IInvestmentService{
private IInvestmentRepositary investmentRepositary;
	@Override
	public void addInvestment(Investment investment) {
		investmentRepositary.addInvestment(investment);
	}
@Autowired
	public void setInvestmentRepositary(IInvestmentRepositary investmentRepositary) {
		this.investmentRepositary = investmentRepositary;
	}

	@Override
	public void updateInvestment(int planId, double amount) {
		investmentRepositary.updateInvestment(planId, amount);		
	}

	@Override
	public void deleteInvestment(int planIdt) {
		investmentRepositary.deleteInvestment(planIdt);		
	}

	@Override
	public List<Investment> getByType(String type) {
		return null;
	}

	@Override
	public List<Investment> getByPurpose(String purpose) {
		
		return investmentRepositary.findByPurpose(purpose);
	}

	@Override
	public List<Investment> getByRiskAndTerm(String risk, int term) {
		return  investmentRepositary.findByRiskAndTerm(risk, term);
	}

	@Override
	public List<Investment> getAll() {
		return investmentRepositary.findAll();
	}

	@Override
	public double calculateMaturity(Investment investment) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Investment getById(int planId) {
		return investmentRepositary.findById(planId);
	}

}
