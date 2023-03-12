package com.coderscampus.Unit14.alphaVantage.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StockData {

	/*
	 * From the API:
	 * {
            "1. open": "174.1800",
            "2. high": "174.2400",
            "3. low": "173.9800",
            "4. close": "174.1100",
            "5. volume": "28165"
        }, ........
	 */
	@JsonProperty("1. open")
	private String open;
	
	@JsonProperty("2. high")
	private String high;
	
	@JsonProperty("3. low")
	private String low;
	
	@JsonProperty("4. close")
	private String close;
	
	@JsonProperty("5. volume")
	private String volume;
	
	
	public String getOpen() {
		return open;
	}
	public String getHigh() {
		return high;
	}
	public String getLow() {
		return low;
	}
	public String getClose() {
		return close;
	}
	public String getVolume() {
		return volume;
	}
	
	
	public void setOpen(String open) {
		this.open = open;
	}
	public void setHigh(String high) {
		this.high = high;
	}
	public void setLow(String low) {
		this.low = low;
	}
	public void setClose(String close) {
		this.close = close;
	}
	public void setVolume(String volume) {
		this.volume = volume;
	}
	
	
}
