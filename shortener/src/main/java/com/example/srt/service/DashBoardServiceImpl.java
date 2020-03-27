package com.example.srt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.srt.domain.DashBoardWholeData;
import com.example.srt.domain.UrlData;
import com.example.srt.domain.UrlDataCount;
import com.example.srt.mapper.DashBoardMapper;


@Service
public class DashBoardServiceImpl implements DashBoardService{
	
	@Autowired
	DashBoardMapper dashBoardMapper;

	@Override
	public List<UrlData> getUrlDataList() throws Exception {
		// TODO Auto-generated method stub
		return dashBoardMapper.readAllUrlData(); 
	}

	@Override
	public List<UrlDataCount> getUrlDataCountList() throws Exception {
		// TODO Auto-generated method stub
		return dashBoardMapper.readAllUrlDataCount();
	}
	
	@Override
	public List<DashBoardWholeData> getUrlDataAndCountList() throws Exception {
		// TODO Auto-generated method stub
		return dashBoardMapper.readAllUrlDataAndCount();
	}
	
}
