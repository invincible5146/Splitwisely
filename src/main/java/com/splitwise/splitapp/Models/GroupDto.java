package com.splitwise.splitapp.Models;

import java.util.List;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.splitwise.splitapp.utils.Auditable;
import com.vladmihalcea.hibernate.type.json.JsonStringType;

import org.hibernate.annotations.TypeDef;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@TypeDef(name = "json", typeClass = JsonStringType.class)
@Data
public class GroupDto extends Auditable<String> {
    // public String userName;
    public Long phoneNumber;
    public String groupName;
    public List<String>groupMembers;
}
