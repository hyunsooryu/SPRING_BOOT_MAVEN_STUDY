package com.example.srt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.srt.algorithm.URLShortener;
import com.example.srt.domain.UrlData;
import com.example.srt.mapper.UrlDataMapper;


@Service
public class UrlDataServiceImpl implements UrlDataService{

	@Autowired UrlDataMapper mapper;
	@Autowired URLShortener shortener;
	@Override
	public void register(String originalUrl) throws Exception {
		// TODO Auto-generated method stub
		//shorten algorithm at here
		while(true) {
			String key = shortener.shortenURL(originalUrl);
			String flagStr = mapper.read(key);
			System.out.println(flagStr);
			if(flagStr == null) {
				UrlData data = new UrlData();
				data.setShortUrl(key);
				data.setOriginalUrl(originalUrl);
				mapper.create(data);
				break;
			}
		}	
	}

	@Override
	public String read(String shortUrl) throws Exception {
		// TODO Auto-generated method stub
		String result = mapper.read(shortUrl);
		return result;
	}
	
	@Override
	public Integer check(String originalUrl) throws Exception{
		return mapper.check(originalUrl);
	}
}
