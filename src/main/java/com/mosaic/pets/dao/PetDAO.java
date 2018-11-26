package com.mosaic.pets.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mosaic.pets.dao.PetDAO;


import com.mosaic.pets.model.Pet;

public interface PetDAO {
	
		//Save the record
		long save(Pet pet);
		
		//Get a single record
		Pet get(long id);
		
		//Get all the records
		List<Pet> list();
		
		//Update the record
		void update(long id, Pet pet);
		
		//Delete a record
		void delete(long id);
		
}
