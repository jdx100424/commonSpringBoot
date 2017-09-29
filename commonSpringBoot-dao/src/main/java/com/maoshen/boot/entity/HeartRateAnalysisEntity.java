package com.maoshen.boot.entity;

import java.util.Date;

public class HeartRateAnalysisEntity {
	/**
     * 涉及计算用的信息（年龄，XX，YY等）
     */
    private String calInfo;
    
    public String getCalInfo() {
		return calInfo;
	}

	public void setCalInfo(String calInfo) {
		this.calInfo = calInfo;
	}
 
    private Integer autoid;

    /**
     * uuid
     */
    private String id;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 设备id
     */
    private String deviceId;

    /**
     * 当前上传心率数据条数
     */
    //@Column(name = "quantity_of_heart_rate")
    private Integer quantityOfHeartRate;

    /**
     * 心率数据集合
     */
    //@Column(name = "heart_rates")
    private String heartRates;

    /**
     * 测量开始时间
     */
    //@Column(name = "measurement_date")
    private Date measurementDate;

    /**
     * 创建时间
     */
    private Date created;

    /**
     * 更新时间
     */
    private Long updated;

    /**
     * 减脂锻炼分钟数
     */
    //@Column(name = "exetime_lf")
    private Integer exetimeLf;

    /**
     * 心肺锻炼分钟数
     */
    //@Column(name = "exetime_cpm")
    private Integer exetimeCpm;

    /**
     * 超强锻炼分钟数
     */
    //@Column(name = "exetime_sup")
    private Integer exetimeSup;

    /**
     * 静息心率
     */
    //@Column(name = "silent_heart_rate")
    private Integer silentHeartRate;

    /**
     * 日时间
     */
    //@Column(name = "date_stamp")
    private Long dateStamp;

    /**
     * 是否由睡眠数据算出
     */
    //@Column(name = "sleep_calculate")
    private Integer sleepCalculate;
    
    /**
     * 最小心率
     */
    //@Column(name = "min_heart_rate")
    private Integer minHeartRate;
    
    /**
     * 最大心率
     */
    //@Column(name = "max_heart_rate")
    private Integer maxHeartRate;
    
    /**
     * clientId
     */
    //@Column(name = "client_id")
    private String clientId;
    /**
     * 获取自增主键
     *
     * @return autoid - 自增主键
     */
    public Integer getAutoid() {
        return autoid;
    }

    /**
     * 设置自增主键
     *
     * @param autoid 自增主键
     */
    public void setAutoid(Integer autoid) {
        this.autoid = autoid;
    }

    /**
     * 获取uuid
     *
     * @return id - uuid
     */
    public String getId() {
        return id;
    }

    /**
     * 设置uuid
     *
     * @param id uuid
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取用户id
     *
     * @return user_id - 用户id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置用户id
     *
     * @param userId 用户id
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取设备id
     *
     * @return device_id - 设备id
     */
    public String getDeviceId() {
        return deviceId;
    }

    /**
     * 设置设备id
     *
     * @param deviceId 设备id
     */
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    /**
     * 获取当前上传心率数据条数
     *
     * @return quantity_of_heart_rate - 当前上传心率数据条数
     */
    public Integer getQuantityOfHeartRate() {
        return quantityOfHeartRate;
    }

    /**
     * 设置当前上传心率数据条数
     *
     * @param quantityOfHeartRate 当前上传心率数据条数
     */
    public void setQuantityOfHeartRate(Integer quantityOfHeartRate) {
        this.quantityOfHeartRate = quantityOfHeartRate;
    }

    /**
     * 获取心率数据集合
     *
     * @return heart_rates - 心率数据集合
     */
    public String getHeartRates() {
		return heartRates;
	}

    /**
     * 设置心率数据集合
     *
     * @param heartRate 心率数据集合
     */
	public void setHeartRates(String heartRates) {
		this.heartRates = heartRates;
	}

    /**
     * 获取测量开始时间
     *
     * @return measurement_date - 测量开始时间
     */
    public Date getMeasurementDate() {
        return measurementDate;
    }



	/**
     * 设置测量开始时间
     *
     * @param measurementDate 测量开始时间
     */
    public void setMeasurementDate(Date measurementDate) {
        this.measurementDate = measurementDate;
    }

    /**
     * 获取创建时间
     *
     * @return created - 创建时间
     */
    public Date getCreated() {
        return created;
    }

    /**
     * 设置创建时间
     *
     * @param created 创建时间
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * 获取更新时间
     *
     * @return updated - 更新时间
     */
    public Long getUpdated() {
        return updated;
    }

    /**
     * 设置更新时间
     *
     * @param updated 更新时间
     */
    public void setUpdated(Long updated) {
        this.updated = updated;
    }

    /**
     * 获取减脂锻炼分钟数
     *
     * @return exetime_lf - 减脂锻炼分钟数
     */
    public Integer getExetimeLf() {
        return exetimeLf;
    }

    /**
     * 设置减脂锻炼分钟数
     *
     * @param exetimeLf 减脂锻炼分钟数
     */
    public void setExetimeLf(Integer exetimeLf) {
        this.exetimeLf = exetimeLf;
    }

    /**
     * 获取心肺锻炼分钟数
     *
     * @return exetime_cpm - 心肺锻炼分钟数
     */
    public Integer getExetimeCpm() {
        return exetimeCpm;
    }

    /**
     * 设置心肺锻炼分钟数
     *
     * @param exetimeCpm 心肺锻炼分钟数
     */
    public void setExetimeCpm(Integer exetimeCpm) {
        this.exetimeCpm = exetimeCpm;
    }

    /**
     * 获取超强锻炼分钟数
     *
     * @return exetime_sup - 超强锻炼分钟数
     */
    public Integer getExetimeSup() {
        return exetimeSup;
    }

    /**
     * 设置超强锻炼分钟数
     *
     * @param exetimeSup 超强锻炼分钟数
     */
    public void setExetimeSup(Integer exetimeSup) {
        this.exetimeSup = exetimeSup;
    }

    /**
     * 获取静息心率
     *
     * @return silent_heart_rate - 静息心率
     */
    public Integer getSilentHeartRate() {
        return silentHeartRate;
    }

    /**
     * 设置静息心率
     *
     * @param silentHeartRate 静息心率
     */
    public void setSilentHeartRate(Integer silentHeartRate) {
        this.silentHeartRate = silentHeartRate;
    }

    /**
     * 获取日时间
     *
     * @return date_stamp - 日时间
     */
    public Long getDateStamp() {
        return dateStamp;
    }

    /**
     * 设置日时间
     *
     * @param dateStamp 日时间
     */
    public void setDateStamp(Long dateStamp) {
        this.dateStamp = dateStamp;
    }

	public Integer getSleepCalculate() {
		return sleepCalculate;
	}

	public void setSleepCalculate(Integer sleepCalculate) {
		this.sleepCalculate = sleepCalculate;
	}

	public Integer getMinHeartRate() {
		return minHeartRate;
	}

	public void setMinHeartRate(Integer minHeartRate) {
		this.minHeartRate = minHeartRate;
	}

	public Integer getMaxHeartRate() {
		return maxHeartRate;
	}

	public void setMaxHeartRate(Integer maxHeartRate) {
		this.maxHeartRate = maxHeartRate;
	}

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}
}