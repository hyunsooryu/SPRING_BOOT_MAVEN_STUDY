package com.example.srt.mapper;

import java.util.List;

import com.example.srt.domain.DashBoardWholeData;
import com.example.srt.domain.UrlData;
import com.example.srt.domain.UrlDataCount;

public interface DashBoardMapper {
	
	//R
	public List<UrlData> readAllUrlData() throws Exception;
	public List<UrlDataCount> readAllUrlDataCount() throws Exception;
	public List<DashBoardWholeData> readAllUrlDataAndCount() throws Exception;

}
