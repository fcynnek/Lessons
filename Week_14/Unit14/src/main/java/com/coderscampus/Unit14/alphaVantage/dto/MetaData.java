package com.coderscampus.Unit14.alphaVantage.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MetaData {

	/*
	 * From the API:
	 *  "Meta Data": {
        "1. Information": "Intraday (5min) open, high, low, close prices and volume",
        "2. Symbol": "TSLA",
        "3. Last Refreshed": "2023-03-10 20:00:00",
        "4. Interval": "5min",
        "5. Output Size": "Compact",
        "6. Time Zone": "US/Eastern"
    	}
	 */
	
	@JsonProperty("1. Information")
	private String information;
	
	@JsonProperty("2. Symbol")
	private String symbol;
	
	@JsonProperty("3. Last Refreshed")
	private String lastRefresh;
	
	@JsonProperty("4. Interval")
	private String interval;
	
	@JsonProperty("5. Output Size")
	private String outputSize;
	
	@JsonProperty("6. Time Zone")
	private String timeZone;
	
	
	public String getInformation() {
		return information;
	}
	public String getSymbol() {
		return symbol;
	}
	public String getLastRefresh() {
		return lastRefresh;
	}
	public String getInterval() {
		return interval;
	}
	public String getOutputSize() {
		return outputSize;
	}
	public String getTimeZone() {
		return timeZone;
	}
	
	
	public void setInformation(String information) {
		this.information = information;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public void setLastRefresh(String lastRefresh) {
		this.lastRefresh = lastRefresh;
	}
	public void setInterval(String interval) {
		this.interval = interval;
	}
	public void setOutputSize(String outputSize) {
		this.outputSize = outputSize;
	}
	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}
	
	
}
