package com.example.srt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.srt.domain.UrlData;
import com.example.srt.service.UrlDataService;

@Controller
@RequestMapping("/api")
public class UrlDataController {
	@Autowired 
	private UrlDataService service;
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String test() {
		return "form";
	}	
	@RequestMapping(value = "/register/{originalUrl}", method = RequestMethod.GET)
	public String register(@PathVariable String originalUrl) throws Exception {
		System.out.println("here");
		if(service.check(originalUrl) == 0) {
			service.register(originalUrl);
			return "register_test";
		}
		System.out.println("were");
		return "already_exist";
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String register(UrlData urldata) throws Exception {
		String originalUrl = urldata.getOriginalUrl();
		System.out.println("here");
		if(service.check(originalUrl) == 0) {
			service.register(originalUrl);
			return "register_test";
		}
		System.out.println("were");
		return "already_exist";
	}
	
}
