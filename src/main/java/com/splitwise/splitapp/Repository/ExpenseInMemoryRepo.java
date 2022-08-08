package com.splitwise.splitapp.Repository;

import java.util.HashMap;

import com.splitwise.splitapp.Models.Expense;


public class ExpenseInMemoryRepo implements IExpenseRepo {

	HashMap<Long, Expense> idToExpenseMap = new HashMap<Long, Expense>();
	@Override
	public void saveExpense(Expense expense) {
		idToExpenseMap.put(expense.getId(), expense);

	}

}
