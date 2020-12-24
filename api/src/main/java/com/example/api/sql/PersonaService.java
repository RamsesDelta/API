package com.example.api.sql;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService {
	
	@Autowired
	private PersonaDAO personaDAO;
	
	public List<PeronsaEntity> getAllPersona(){
		return (List<PeronsaEntity>) personaDAO.findAll();
	}
	
	
	public void insertPerson(PeronsaEntity persona) {
		personaDAO.save(persona);
	}

}
