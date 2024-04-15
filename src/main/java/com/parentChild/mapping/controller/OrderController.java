
package com.parentChild.mapping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.parentChild.mapping.entity.Address;
import com.parentChild.mapping.entity.Order;
import com.parentChild.mapping.service.AddressService;
import com.parentChild.mapping.service.OrderService;

import jakarta.validation.Valid;

@RestController
public class OrderController {

	@Autowired
	public OrderService orderService;

	@Autowired
	private AddressService address;

	@GetMapping("/order/{id}")
	public ResponseEntity<Order> getOrder(@PathVariable String id) {

		Order order = orderService.getOrderById(id);
		return ResponseEntity.accepted().body(order);

	}

	@GetMapping("address/{id}")
	public Address getById(@PathVariable("id") String id) {

		return address.getAddressById(id);

	}

	@PostMapping("/order")
	public ResponseEntity<Order> saveOrder(@Valid @RequestBody Order order) {

		Order saveOrder = orderService.saveOrder(order);

		// HttpHeaders header = new HttpHeaders();

		// return ResponseEntity.accepted().headers(header).body("Order Confirm! ");//
		// .saveOrder(order);

		System.out.println("saved");

		return ResponseEntity(saveOrder, HttpStatus.CREATED);

	}

	private ResponseEntity<Order> ResponseEntity(Order saveOrder, HttpStatus created) {
		// TODO Auto-generated method stub
		return null;
	}
}
