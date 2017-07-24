package com.bookstore.domain.security;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Role {

	@Id
	private int roleId;
	private String name;
	
}
