package com.example.srt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.srt.domain.UrlData;
import com.example.srt.service.UrlDataCountService;
import com.example.srt.service.UrlDataService;


@Controller
@RequestMapping("/")
public class RedirectController {
	@Autowired 
	private UrlDataService service;
	@Autowired
	private UrlDataCountService countService;
	
	@RequestMapping(value = "/p/{type}/{prdCd}", method = RequestMethod.GET)
	public String prdLink(@PathVariable String type, @PathVariable String prdCd) throws Exception {
		updateUrlDataCount("p/" + type + "/" + prdCd);
		return "redirect:http://m.gsshop.com/prd/prd.gs?prdid=" + prdCd + addUrlAdress(type);
	}
	
	
	@RequestMapping(value = "/d/{type}/{dealNo}", method = RequestMethod.GET)
	public String dealLink(@PathVariable String type, @PathVariable String dealNo) throws Exception{
		updateUrlDataCount("p/" + type + "/" + dealNo);
		return "redirect:http://m.gsshop.com/deal/deal.gs?dealNo=" + dealNo + addUrlAdress(type);
	}
	
	
	@RequestMapping(value = "/{shortUrl}", method = RequestMethod.GET)
	public String readBy(@PathVariable String shortUrl, Model model) throws Exception{
		String result = "redirect:";
		String target = service.read(shortUrl);
		if(target == null) {
			return "read_no";
		}
		
		
		updateUrlDataCount(shortUrl);
		
		System.out.println(shortUrl + " -> " + target);
		model.addAttribute("target", target);
		//return "read_test";
		//
		
		if(target.startsWith("http://") || target.startsWith("https://")) {
			result += target;
		}
		else {
			result += "http://" + target;
		}
		
		return result;
	}
	
	
	//뒤에 세부 주소 붙여주는 함수
	public String addUrlAdress(String type) throws Exception{
		if(type.equals("01")) return "&utm_source=url&utm_medium=sns&utm_campaign=shareurl";
		return "&utm_source=sms&utm_medium=sns&utm_campaign=sharesms";
	}
	//
	
	public void updateUrlDataCount(String shortUrl) throws Exception {
		if(!countService.check(shortUrl)) {
			countService.register(shortUrl);
		}
		countService.increment(shortUrl);
	}
		
}
