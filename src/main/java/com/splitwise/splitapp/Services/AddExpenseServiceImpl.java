package com.splitwise.splitapp.Services;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.splitwise.splitapp.Models.ExpenseData;
import com.splitwise.splitapp.Models.ExpenseDto;
import com.splitwise.splitapp.Models.Group;
import com.splitwise.splitapp.Repository.GroupRepository;

@Service
public class AddExpenseServiceImpl implements AddExpenseService{

    @Autowired
    GroupRepository groupRepository;
    
    @Override
    public void addExpense(Long userId, ExpenseDto expense) {
        System.out.println("sachin");
        System.out.println(expense);
        System.out.println("sachin");
        List<ExpenseData> items = expense.getItems();
        Optional<Group> group = groupRepository.findById(userId);
        Group groups=null;
        if(group.isPresent()){
            groups= group.get();
        }
        List<String> members = groups.getGroupMembers();
        for(int i=0;i<items.size();i++){
            Object paidBy = items.get(i).getPaid_by().get(0);
            Object owedBy = items.get(i).getOwed_by().get(0);
            ObjectMapper objectMapper = new ObjectMapper();
            Map<String, String> paidByMap = objectMapper.convertValue(paidBy, Map.class);
            Map<String, String> owedByMap = objectMapper.convertValue(owedBy, Map.class);
            
            Set<String>paidByMapKeys = paidByMap.keySet();
            Set<String>owedByMapKeys = owedByMap.keySet();
            for(String s:paidByMapKeys){
                if(members.contains(s)==false){
                    members.add(s);
                }
            }
            for(String s:owedByMapKeys){
                if(members.contains(s)==false){
                    members.add(s);
                }
            }
        }

        groups.setGroupMembers(members);
        groupRepository.save(groups);
    }
    
}
