package com.splitwise.splitapp.Repository;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.splitwise.splitapp.Models.User;

public interface UserRepository extends JpaRepository<User,BigDecimal> {
    
    @Query(value = "select * from users where users.email=?1", nativeQuery = true)
    User getUser(String email);
}
