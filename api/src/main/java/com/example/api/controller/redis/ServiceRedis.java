package com.example.api.controller.redis;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class ServiceRedis implements IService{

	private static final Logger log = LoggerFactory.getLogger(ServiceRedis.class);
	
	private RedisTemplate<String, String> redisTemplate;
	
	private HashOperations hashOperations;
	
	public ServiceRedis(RedisTemplate<String, String> redisTemplate) {
        this.redisTemplate = redisTemplate;

        hashOperations = redisTemplate.opsForHash();
    }
	
	public void save(GenericDTO genericDTO) {
		
		log.info("insertando en redis");
		
		
		
		hashOperations.put("Persona", genericDTO.getId(), genericDTO.getValues());
		
	}
	
	public Map<String,Map<String,String>> findAll(){
		
		return hashOperations.entries("Persona");
	}
}
