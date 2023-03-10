package it.generationitaly.examplewebapp.repository;

import java.util.List;

import it.generationitaly.examplewebapp.entity.Contatti;

public interface ContattiRepository {

	Contatti findById(int id);
	
	List<Contatti> findAll();
	
	void save(Contatti contatto);
	
	void update(Contatti contatto);
	
	void delete(Contatti contatto);
	
	Contatti findByTelefono(String telefono);
	
	Contatti findByMail(String mail);
	
	Contatti findByDomicilio(String domicilio);
	
}
