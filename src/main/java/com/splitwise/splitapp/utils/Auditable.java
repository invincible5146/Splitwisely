package com.splitwise.splitapp.utils;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;

import com.fasterxml.jackson.annotation.JsonFormat;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Data;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@Data
public abstract class Auditable<U> {
    @CreatedBy
    @Column(name = "created_by")
    protected U createdBy;

   @CreationTimestamp
   @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Kolkata")
   @Column(name = "created_at")
   protected Date createdDate;

   @LastModifiedBy
   @Column(name = "updated_by")
   protected U modifiedBy;

   @UpdateTimestamp
   @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Kolkata")
   @Column(name = "updated_at")
   protected Date modifiedDate;
}
