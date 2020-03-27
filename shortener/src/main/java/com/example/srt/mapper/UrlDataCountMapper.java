package com.example.srt.mapper;

public interface UrlDataCountMapper {
	//C
	public void create(String shortUrl) throws Exception;
	
	//U
	public void update(String shortUrl) throws Exception;
	
	//CHECK
	public Integer check(String shortUrl) throws Exception;
}
