package com.example.srt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.srt.mapper.UrlDataCountMapper;

@Service
public class UrlDataCountServiceImpl implements UrlDataCountService{

	@Autowired
	UrlDataCountMapper mapper;
	
	@Override
	public void register(String shortUrl) throws Exception {
		// TODO Auto-generated method stub
		mapper.create(shortUrl);
	}

	@Override
	public void increment(String shortUrl) throws Exception {
		// TODO Auto-generated method stub
		mapper.update(shortUrl);
	}

	@Override
	public boolean check(String shortUrl) throws Exception {
		// TODO Auto-generated method stub
		return mapper.check(shortUrl) == 1;
	}
	
	
	
}
