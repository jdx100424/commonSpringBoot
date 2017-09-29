package com.maoshen.boot.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.maoshen.boot.entity.HeartRateAnalysisEntity;

@Repository
public interface HeartRateAnalysisEntityMapper {
	public List<HeartRateAnalysisEntity> selectByCondition(@Param("autoid")Long autoid);
}