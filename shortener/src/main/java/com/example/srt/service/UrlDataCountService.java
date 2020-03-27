package com.example.srt.service;

public interface UrlDataCountService {
	
	public void register(String shortUrl) throws Exception;
	
	public void increment(String shortUrl) throws Exception;
	
	public boolean check(String shortUrl) throws Exception;

}
