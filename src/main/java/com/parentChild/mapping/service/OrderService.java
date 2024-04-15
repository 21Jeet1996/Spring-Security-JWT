package com.parentChild.mapping.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parentChild.mapping.entity.Order;
import com.parentChild.mapping.repository.OrderRepository;

@Service
public class OrderService {

	@Autowired
	public OrderRepository orderRepository;

	public Order getOrderById(String id) {
		Order order = orderRepository.findById(id).get();
		return order;
	}

	public Order saveOrder(Order order) {
		// Address address= order.getAddress();
		return orderRepository.save(order);

	}

}
