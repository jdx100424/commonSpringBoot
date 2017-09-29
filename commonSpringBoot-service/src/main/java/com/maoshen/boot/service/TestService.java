package com.maoshen.boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.maoshen.boot.dao.HeartRateAnalysisEntityMapper;

@Service
public class TestService {
	@Autowired
	private HeartRateAnalysisEntityMapper heartRateAnalysisEntityMapper;

	public String get() {
		return "jdxTest:"+JSONObject.toJSONString(heartRateAnalysisEntityMapper.selectByCondition(1286913L));
	}
}
