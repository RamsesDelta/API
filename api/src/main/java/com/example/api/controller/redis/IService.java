package com.example.api.controller.redis;

import java.util.Map;



public interface IService {
	void save(GenericDTO genericDTO);
	
	Map<String,Map<String,String>> findAll();
}
