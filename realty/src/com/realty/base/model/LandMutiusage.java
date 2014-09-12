package com.realty.base.model;

// Generated 2014-7-24 15:56:47 by Hibernate Tools 3.4.0.CR1

import java.io.Serializable;

/**
 * LandMutiusage generated by hbm2java
 */
public class LandMutiusage implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1406629303669607899L;
	private int mutiusageId;
	private int landId;
	private Integer landusageId;
	private String landusageDetail;
	private Double landArea;
	private Double planArea;
	private String landLevel;
	private Integer useyear;
	private Double initialPrice;
	private Double dealPrice;
	private String ramarks;

	public LandMutiusage() {
	}

	public LandMutiusage(int mutiusageId, int landId) {
		this.mutiusageId = mutiusageId;
		this.landId = landId;
	}

	public LandMutiusage(int mutiusageId, int landId, Integer landusageId,
			String landusageDetail, Double landArea, Double planArea,
			String landLevel, Integer useyear, Double initialPrice,
			Double dealPrice, String ramarks) {
		this.mutiusageId = mutiusageId;
		this.landId = landId;
		this.landusageId = landusageId;
		this.landusageDetail = landusageDetail;
		this.landArea = landArea;
		this.planArea = planArea;
		this.landLevel = landLevel;
		this.useyear = useyear;
		this.initialPrice = initialPrice;
		this.dealPrice = dealPrice;
		this.ramarks = ramarks;
	}

	public int getMutiusageId() {
		return this.mutiusageId;
	}

	public void setMutiusageId(int mutiusageId) {
		this.mutiusageId = mutiusageId;
	}

	public int getLandId() {
		return this.landId;
	}

	public void setLandId(int landId) {
		this.landId = landId;
	}

	public Integer getLandusageId() {
		return this.landusageId;
	}

	public void setLandusageId(Integer landusageId) {
		this.landusageId = landusageId;
	}

	public String getLandusageDetail() {
		return this.landusageDetail;
	}

	public void setLandusageDetail(String landusageDetail) {
		this.landusageDetail = landusageDetail;
	}

	public Double getLandArea() {
		return this.landArea;
	}

	public void setLandArea(Double landArea) {
		this.landArea = landArea;
	}

	public Double getPlanArea() {
		return this.planArea;
	}

	public void setPlanArea(Double planArea) {
		this.planArea = planArea;
	}

	public String getLandLevel() {
		return this.landLevel;
	}

	public void setLandLevel(String landLevel) {
		this.landLevel = landLevel;
	}

	public Integer getUseyear() {
		return this.useyear;
	}

	public void setUseyear(Integer useyear) {
		this.useyear = useyear;
	}

	public Double getInitialPrice() {
		return this.initialPrice;
	}

	public void setInitialPrice(Double initialPrice) {
		this.initialPrice = initialPrice;
	}

	public Double getDealPrice() {
		return this.dealPrice;
	}

	public void setDealPrice(Double dealPrice) {
		this.dealPrice = dealPrice;
	}

	public String getRamarks() {
		return this.ramarks;
	}

	public void setRamarks(String ramarks) {
		this.ramarks = ramarks;
	}

}