package com.chl.redis;

public interface KeyPrefix {
		
	public int expireSeconds();
	
	public String getPrefix();
	
}
