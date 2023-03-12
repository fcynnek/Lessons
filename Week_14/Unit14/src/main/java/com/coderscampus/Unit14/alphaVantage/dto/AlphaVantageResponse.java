package com.coderscampus.Unit14.alphaVantage.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AlphaVantageResponse {

	// Google: JSON parser
	
	@JsonProperty("Meta Data")
	private MetaData metaData;
	
	@JsonProperty("Time Series (5min)")
	private TimeSeries timeSeries;
	
	
	public MetaData getMetaData() {
		return metaData;
	}
	public TimeSeries getTimeSeries() {
		return timeSeries;
	}
	
	
	public void setMetaData(MetaData metaData) {
		this.metaData = metaData;
	}
	public void setTimeSeries(TimeSeries timeSeries) {
		this.timeSeries = timeSeries;
	}
	
	
}
