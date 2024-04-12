package com.parentChild.mapping.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parentChild.mapping.entity.OrderEntity;
import com.parentChild.mapping.repository.OrderRepository;

@Service
public class OrderService {

	@Autowired
	public OrderRepository orderRepository;

	public OrderEntity getOrderById(String id) {
		OrderEntity order = orderRepository.findById(id).get();
		return order;
	}

	public OrderEntity saveOrder(OrderEntity order) {
		// Address address= order.getAddress();
		return orderRepository.save(order);

	}

}
