package com.grupoone.instrutor.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grupoone.instrutor.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	
	Optional<User> findByUsername(String username);
	Optional<User> findByEmail(String email);  // find pelo atributo que desejar
	Optional<User> findByPassword(String password); //não aconselhável FAZER ISSO

	Boolean existsByUsername(String username);
	Boolean existsByEmail(String email);
}