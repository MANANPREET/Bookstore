package com.bookstore.repository;

import org.springframework.data.repository.CrudRepository;

import com.bookstore.domain.User;

/**
 * 
 * @author Manan
 *
 */
public interface UserRepository extends CrudRepository<User, Long> {
	User findByUsername(String username);
}
