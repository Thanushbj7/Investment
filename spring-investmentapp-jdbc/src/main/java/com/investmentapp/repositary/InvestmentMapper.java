package com.investmentapp.repositary;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.investmentapp.model.Investment;

public class InvestmentMapper implements RowMapper<Investment>{
@Override
	public Investment mapRow(ResultSet rs,int rowNum)throws SQLException{
		String planName=rs.getString("plan_name");
		String purpose=rs.getString("purpose");
		String nominee=rs.getString("nominee");
		String planType=rs.getString("type");
		String risk=rs.getString("risk");
		int term=rs.getInt("term");
		int entryAge=rs.getInt("entry_age");
		double amount=rs.getDouble("amount");
		int planId=rs.getInt("plan_id");
		
		Investment investment=new Investment();
		investment.setAmount(amount);
		investment.setEntryAge(entryAge);
		investment.setNominee(nominee);
		investment.setPlanId(planId);
		investment.setPlanName(planName);
		investment.setPurpose(purpose);
		investment.setRisk(risk);
		investment.setTerm(term);
		investment.setType(planType);
		
		
		return investment;
	}

}
