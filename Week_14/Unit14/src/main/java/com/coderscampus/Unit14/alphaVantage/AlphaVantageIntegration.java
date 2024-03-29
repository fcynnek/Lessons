package com.coderscampus.Unit14.alphaVantage;

import java.net.URI;

import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.coderscampus.Unit14.alphaVantage.dto.AlphaVantageResponse;

public class AlphaVantageIntegration {

	@Test
	public void callApiExample() {
		RestTemplate rt = new RestTemplate();
		
		// https://www.alphavantage.co/query?function=TIME_SERIES_INTRADAY&symbol=IBM&interval=5min&apikey=demo
		URI uri = UriComponentsBuilder.fromHttpUrl("https://www.alphavantage.co/query")
										.queryParam("function", "TIME_SERIES_INTRADAY")
										.queryParam("symbol", "TSLA")
										.queryParam("interval", "5min")
										.queryParam("apikey", "0YKY2YCSMQE8ZPL4")
										.build()
										.toUri();
		
		/*
		 * API Key:
		 * https://www.alphavantage.co/support/#api-key
		 * Welcome to Alpha Vantage! Your dedicated access key is: 0YKY2YCSMQE8ZPL4. 
		 * Please record this API key at a safe place for future data access.
		 */
		
//		String response = rt.getForObject(uri, String.class); // this wraps the response as String Objects
//		ResponseEntity<String> response = rt.getForEntity(uri, String.class); // this returns more information from the API such as headers, response status
		// instead of receiving a string, we want to map out the entire return data into our getters and setters that we created
		ResponseEntity<AlphaVantageResponse> response = rt.getForEntity(uri, AlphaVantageResponse.class);
		System.out.println(response);
		System.out.println(response.getStatusCodeValue());
		System.out.println(response.getHeaders());
	}
}
