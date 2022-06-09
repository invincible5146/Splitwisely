package com.splitwise.splitapp.Models;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.TypeDef;

import com.vladmihalcea.hibernate.type.json.JsonBinaryType;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@TypeDef(name = "jsonb", typeClass = JsonBinaryType.class)
@Table(name="users")
public class User {
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    BigDecimal userId;

    @Column(name = "email")
    String email;

    @Column(name = "password")
    String password;

}
