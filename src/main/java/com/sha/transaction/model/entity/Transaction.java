package com.sha.transaction.model.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Data
@javax.persistence.Entity
@Table(name="TRANSACTIONS")
public class Transaction extends Entity<Integer>
{

    @Column(name="TRANSACTION_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Id
    @Override
    public Integer getId() {
        return super.getId();
    }

    @Column(name = "PRODUCT_ID",nullable = false)
    private Integer productID;

    @Column(name = "USER_ID",nullable = false)
    private Integer userID;

    @Temporal(TemporalType.DATE)
    @Column(name = "TRANSACTION_TIME")
    private Date transactionTime;
}
