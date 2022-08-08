package com.splitwise.splitapp.Services;

import com.splitwise.splitapp.Models.Expense;

public interface SplitStrategy {
	
	public void calculateOwnedAmount(Expense expense);

}
