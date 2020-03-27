package com.example.srt.service;

import java.util.List;

import com.example.srt.domain.DashBoardWholeData;
import com.example.srt.domain.UrlData;
import com.example.srt.domain.UrlDataCount;

public interface DashBoardService {
	public List<UrlData> getUrlDataList() throws Exception;
	public List<UrlDataCount> getUrlDataCountList() throws Exception;
	public List<DashBoardWholeData> getUrlDataAndCountList() throws Exception;
}
