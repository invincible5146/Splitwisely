package com.splitwise.splitapp.Services;


import com.splitwise.splitapp.Models.ExpenseDto;

public interface AddExpenseService {
    void addExpense(Long userId, ExpenseDto expense);
}
