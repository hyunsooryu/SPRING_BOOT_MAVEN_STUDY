package com.example.srt.mapper;

import com.example.srt.domain.UrlData;

public interface UrlDataMapper {
	
	//C
	public void create(UrlData urlData) throws Exception;
	
	//R
	public String read(String shortUrl) throws Exception;
	
	//CHECK
	public Integer check(String originalUrl) throws Exception;
}
