package com.smartbill360.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smartbill360.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, String>{

	Optional<User> findByEmailAndPasswordAndIsActiveTrue(String email, String password);

	Optional<User> findByEmailAndIsActiveTrue(String email);

}
