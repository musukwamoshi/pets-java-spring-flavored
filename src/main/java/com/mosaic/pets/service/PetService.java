package com.mosaic.pets.service;

import java.util.List;

import com.mosaic.pets.model.Pet;


public interface PetService {
	
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
