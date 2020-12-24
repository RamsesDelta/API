package com.example.api.mongo;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PersonaServiceMongo {

	private static final Logger log = LogManager.getLogger(PersonaServiceMongo.class);
	
	@Autowired
	private RepositoryPersona repoPersona;
	
	
	public List<Persona> findAllPersona(){
		
		log.info("dentro del metodo de find ALL");
		
		
		log.info("+++++++"+repoPersona.findAll().toString());
		
		return repoPersona.findAll();
	}
	
	public void insert(Persona persona) {
		repoPersona.save(persona);
	}
}
