package com.mosaic.pets.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mosaic.pets.service.PetService;
import com.mosaic.pets.model.Pet;

@Controller
public class PetController {
	
	@Autowired
	private PetService petService;
	
	//pull all pets
	@RequestMapping("/")
	public ModelAndView index() {
		
		ModelAndView mv = new ModelAndView("index");
		List<Pet> list = petService.list();
		mv.addObject("lists", list);
		return mv;
		
	}
	
	//show one pet
	@RequestMapping("show/{id}")
	public ModelAndView show () {
		
		ModelAndView mv = new ModelAndView("show");
		Pet pet = petService.get(id);
		mv.addObject("pet",pet);
		
		return mv;
	}
	
	
	@RequestMapping("add/pet")
	public void save() {
		
		long id = petService.save(pet);
		
		
		
		
	}
	
	
	
	@RequestMapping("edit/{id}")
	public ModelAndView edit() {
		
		
		
		
		
		
	}
	
	
	
	@RequestMapping("update/{id}")
	public void  update() {
		
		
		
		
		
		
		
	}
	
	
	@RequestMapping("delete/")
    public void delete() {
		
		
		
		
	}

}
