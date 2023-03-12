package com.coderscampus.Unit14.alphaVantage.dto;

import java.util.List;

public class TimeSeries {

	/*
	 * From the API:
	 * "Time Series (5min)": {
        "2023-03-10 20:00:00": {
            "1. open": "174.1200",
            "2. high": "174.5000",
            "3. low": "174.1000",
            "4. close": "174.4700",
            "5. volume": "58814"
        },
        "2023-03-10 19:55:00": {
            "1. open": "174.1800",
            "2. high": "174.2400",
            "3. low": "173.9800",
            "4. close": "174.1100",
            "5. volume": "28165"
        }, ........
	 */
	
	private List<StockData> stockData;

	public List<StockData> getStockData() {
		return stockData;
	}

	public void setStockData(List<StockData> stockData) {
		this.stockData = stockData;
	}
}
