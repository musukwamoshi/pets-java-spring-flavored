package com.mosaic.pets.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.mosaic.pets.model.Pet;

@Repository
public class PetDAOImpl implements PetDAO {
	
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public long save(Pet pet) {
		sessionFactory.getCurrentSession().save(pet);
		return pet.getId();
	}

	@Override
	public Pet get(long id) {
		return sessionFactory.getCurrentSession().get(Pet.class, id);
	}

	@Override
	public List<Pet> list() {
		List<Pet> list = sessionFactory.getCurrentSession().createQuery("from Pet").list();
		return list;
	}

	@Override
	public void update(long id, Pet pet) {
		
	Session session = sessionFactory.getCurrentSession();
	Pet oldPet = session.byId(Pet.class).load(id);
	oldPet.setTown(pet.getTown());
	oldPet.setPhonenumber(pet.getPhonenumber());
	oldPet.setPoster(pet.getPoster());
	
	session.flush();
	
	}
	
	@Override
	public void delete(long id) {
		Session session = sessionFactory.getCurrentSession();
	    Pet pet = session.byId(Pet.class).load(id);
		session.delete(pet);
	}
	
	
}
