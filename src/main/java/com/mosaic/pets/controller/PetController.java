package com.mosaic.pets.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.mosaic.pets.service.PetService;
import com.mosaic.pets.model.Pet;

@Controller
public class PetController {
	
	@Autowired
	private PetService petService;
	
	//pull all pets
	@GetMapping("/all")
	public ModelAndView index() {
		
		ModelAndView mv = new ModelAndView("index");
		List<Pet> list = petService.list();
		mv.addObject("pets", list);
		return mv;
		
	}
	
	//show one pet
	@GetMapping("/show/pet/{id}")
	public ModelAndView show (@PathVariable("id") long id) {
		
		ModelAndView mv = new ModelAndView("show");
		Pet pet = petService.get(id);
		mv.addObject("pet",pet);
		
		return mv;
	}
	
	
	@GetMapping("/add/pet")
    public ModelAndView add() {
        return new ModelAndView("add", "pet", new Pet());
    }
	
	
	@PostMapping("/save/pet")
	public String save(@ModelAttribute("pet") Pet pet) {
		
		petService.save(pet);
		return "redirect:/all";
		
	}
	
	
	@GetMapping("/edit/pet/{id}")
	public ModelAndView edit(@PathVariable("id") long id) {
		
		ModelAndView mv = new ModelAndView("show");
		Pet pet = petService.get(id);
		mv.addObject("pet",pet);
		
		return mv;
		
		
	}
	
	
	
	@PostMapping("update/pet/{id}")
	public String  update(@PathVariable("id") long id,@ModelAttribute("pet") Pet pet) {
		
		petService.update(id, pet);
		
		return "redirect:/all";
	}
	
	
	@DeleteMapping("/delete/pet")
    public String delete(@PathVariable("id") long id) {
		
		petService.delete(id);
		return "redirect:/all";
		
	}

}
