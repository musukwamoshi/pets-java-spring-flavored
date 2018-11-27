package com.mosaic.pets.controller;

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
	
	@RequestMapping("/")
	public ModelAndView index() {
		
		
		
		
		
	}
	
	@RequestMapping("show/{id}")
	public ModelAndView show () {
		
		
		
		
		
		
		
	}
	
	
	@RequestMapping("add/")
	public void save() {
		
		
		
		
		
		
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
