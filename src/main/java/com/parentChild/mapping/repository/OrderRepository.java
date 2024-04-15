package com.parentChild.mapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.parentChild.mapping.entity.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, String> {

}
