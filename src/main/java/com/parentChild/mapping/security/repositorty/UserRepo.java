package com.parentChild.mapping.security.repositorty;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.parentChild.mapping.security.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {

	public Optional<User> findByEmail(String email);
}
