package com.parentChild.mapping.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parentChild.mapping.entity.Address;
import com.parentChild.mapping.repository.AddressRepo;

@Service
public class AddressService {

	@Autowired
	private AddressRepo addressRepo;

	public Address getAddressById(String addressId) {
		return addressRepo.findById(addressId).get();
	}

}
