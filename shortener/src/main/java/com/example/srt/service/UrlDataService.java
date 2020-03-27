package com.example.srt.service;

import com.example.srt.domain.UrlData;

public interface UrlDataService {

public void register(String originalUrl) throws Exception;
	
public String read(String shortUrl) throws Exception;

public Integer check(String originalUrl) throws Exception;
}