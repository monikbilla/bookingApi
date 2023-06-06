package com.sentryc.bookingapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sentryc.bookingapi.entity.Transaction;
@Repository
public interface TransRepo extends JpaRepository<Transaction, Integer>{
    
} 