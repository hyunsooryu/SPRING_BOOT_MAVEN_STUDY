package com.example.srt.controller;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.srt.domain.DashBoardWholeData;
import com.example.srt.domain.UrlData;
import com.example.srt.domain.UrlDataCount;
import com.example.srt.service.DashBoardService;

@Controller
@RequestMapping("/dashboard")
public class DashBoardController {
	@Autowired
	DashBoardService dashBoardService;
	
	@RequestMapping("/urldatalist")
	public String urlDataList(Model model) throws Exception {
		List<UrlData> urlDataList = dashBoardService.getUrlDataList();
		model.addAttribute(urlDataList);
		return "urldatalist";
	}
	
	
	@RequestMapping("/urldatacountlist")
	public String urlDataCountList(Model model) throws Exception{
		System.out.println("HI~~");
		List<UrlDataCount> urlDataCountList = dashBoardService.getUrlDataCountList();
		System.out.println("BI~~");
		model.addAttribute(urlDataCountList);
		return "urldatacountlist";
	}
	
	
	@RequestMapping("/index")
	public String home(Model model) throws Exception{
		System.out.println("HI~~");
		List<DashBoardWholeData> dashBoard  = dashBoardService.getUrlDataAndCountList();		
		model.addAttribute(dashBoard);
		System.out.println("BI~~");
		return "index";
		
	}
}
