package com.mosaic.pets.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mosaic.pets.dao.PetDAO;
import com.mosaic.pets.model.Pet;

@Service
public class PetServiceImpl implements PetService {
	
	@Autowired
	private PetDAO petDAO;
	
	@Override
	@Transactional
	public long save(Pet pet) {
		return petDAO.save(pet);
	}

	@Override
	@Transactional
	public Pet get(long id) {
		return petDAO.get(id);
	}

	@Override
	@Transactional
	public List<Pet> list() {
		return petDAO.list();
	}

	@Override
	@Transactional
	public void update(long id, Pet pet) {
		petDAO.update(id, pet);
	}

	@Override
	@Transactional
	public void delete(long id) {
	    petDAO.delete(id);	
	}

}
