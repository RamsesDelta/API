package com.example.api.controller.redis;

import java.util.Map;

public class GenericDTO {
	
	private String id;
	
	private Map<String,String> values;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Map<String, String> getValues() {
		return values;
	}

	public void setValues(Map<String, String> values) {
		this.values = values;
	}

}
