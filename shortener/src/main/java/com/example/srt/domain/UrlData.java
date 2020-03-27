package com.example.srt.domain;


public class UrlData {
	private String shortUrl;
	private String originalUrl;
	private UrlDataCount urlDataCount;
	
	public String getShortUrl() {
		return shortUrl;
	}
	
	
	public void setShortUrl(String shortUrl) {
		this.shortUrl = shortUrl;
	}
	
	
	public String getOriginalUrl() {
		return originalUrl;
	}
	
	
	public void setOriginalUrl(String originalUrl) {
		this.originalUrl = originalUrl;
	}


	public UrlDataCount getUrlDataCount() {
		return urlDataCount;
	}


	public void setUrlDataCount(UrlDataCount urlDataCount) {
		this.urlDataCount = urlDataCount;
	} 
	
	
	
}
