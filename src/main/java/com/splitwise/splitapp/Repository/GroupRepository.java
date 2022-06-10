package com.splitwise.splitapp.Repository;

import com.splitwise.splitapp.Models.Group;


import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupRepository extends JpaRepository<Group,Long>{
    
}
