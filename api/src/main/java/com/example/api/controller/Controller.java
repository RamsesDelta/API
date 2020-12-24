package com.example.api.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.api.controller.redis.GenericDTO;
import com.example.api.controller.redis.ServiceRedis;
import com.example.api.mongo.Persona;
import com.example.api.mongo.PersonaServiceMongo;
import com.example.api.sql.PeronsaEntity;
import com.example.api.sql.PersonaService;

@RestController
public class Controller {

	
	@Autowired
	private PersonaServiceMongo serviceMongo;
	
	@Autowired
	private PersonaService personaServiceSQL;
	
	@Autowired
	private ServiceRedis serviceRedis;
	
	
	@GetMapping("/mongo")
	public List<Persona> getMongo() {
		return serviceMongo.findAllPersona();
	}
	
	@PostMapping("/insertMongo")
	public void insertMongo(@RequestBody Persona persona) {
		serviceMongo.insert(persona);
	}
	
	@GetMapping("/redis")
	public Map<String, Map<String,String>> getRedis() {
		return serviceRedis.findAll();
	}
	
	@PostMapping("/insertRedis")
	public void insertRedis(@RequestBody GenericDTO generic) {
		serviceRedis.save(generic);
	}
	
	@GetMapping("/SQL")
	public List<PeronsaEntity> getSQL() {
		return personaServiceSQL.getAllPersona();
	}
	
	@PostMapping("/insertSQL")
	public void  insertSQL(@RequestBody PeronsaEntity persona ) {
		personaServiceSQL.insertPerson(persona);
	}
	
}
