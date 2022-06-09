package com.splitwise.splitapp.Repository;

import com.splitwise.splitapp.Models.Group;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupRepository extends JpaRepository<Group,BigDecimal>{
    
}
