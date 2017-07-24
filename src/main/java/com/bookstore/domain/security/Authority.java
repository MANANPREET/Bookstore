package com.bookstore.domain.security;

import org.springframework.security.core.GrantedAuthority;
/**
 * 
 * @author Manan
 *
 */
@SuppressWarnings("serial")
public class Authority implements GrantedAuthority{

	private final String authority;
	
	public Authority(String authority) {
		this.authority = authority;
	}
	
	public String getAuthority() {
		return authority;
	}

}
