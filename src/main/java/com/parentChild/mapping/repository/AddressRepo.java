package com.parentChild.mapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.parentChild.mapping.entity.Address;

@Repository
public interface AddressRepo extends JpaRepository<Address, String> {

}
