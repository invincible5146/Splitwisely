package com.splitwise.splitapp.Services;

import com.splitwise.splitapp.Models.Expense;

public interface PaymentStrategy {
	public void calculatePaidAmount(Expense expense);
}
