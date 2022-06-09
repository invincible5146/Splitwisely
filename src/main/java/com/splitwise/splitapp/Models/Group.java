package com.splitwise.splitapp.Models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import com.vladmihalcea.hibernate.type.json.JsonBinaryType;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@TypeDef(name = "jsonb", typeClass = JsonBinaryType.class)
@Table(name="splitgroup")
public class Group {
    @Id
    Long phoneNumber;

    @Column(name = "group_name")
    String groupName;

    @Type(type = "jsonb")
    @Column(columnDefinition = "json", name = "group_members")
    List<String>groupMembers=new ArrayList<String>();;
}
