package com.learn.SpendingManagement.entity.spendingmanagement;

import com.learn.SpendingManagement.entity.base.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Transaction extends BaseEntity {
  @Column(name = "tag_finance_id")
  private String tagFinanceId;
  @Column(name = "title")
  private String title;
  @Column(name = "amount")
  private Double amount;
  @Column(name = "description")
  private String description;
}
