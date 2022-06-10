package com.splitwise.splitapp.Models;

import java.util.List;

import org.hibernate.annotations.TypeDef;

import com.splitwise.splitapp.utils.Auditable;
import com.vladmihalcea.hibernate.type.json.JsonStringType;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@TypeDef(name = "json", typeClass = JsonStringType.class)
@Data
public class ExpenseDto extends Auditable<String>{
    
    String name;
    List<ExpenseData>items;
}
