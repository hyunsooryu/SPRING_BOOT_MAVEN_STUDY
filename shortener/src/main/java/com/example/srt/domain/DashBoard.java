package com.example.srt.domain;

import java.util.List;

public class DashBoard {
	private List<UrlData> urlDataList;
	private List<UrlDataCount> urlDataCount;
	
	public List<UrlData> getUrlDataList() {
		return urlDataList;
	}
	public void setUrlDataList(List<UrlData> urlDataList) {
		this.urlDataList = urlDataList;
	}
	public List<UrlDataCount> getUrlDataCount() {
		return urlDataCount;
	}
	public void setUrlDataCount(List<UrlDataCount> urlDataCount) {
		this.urlDataCount = urlDataCount;
	}
	
}
