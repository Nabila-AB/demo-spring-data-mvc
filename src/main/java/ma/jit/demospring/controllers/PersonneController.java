package ma.jit.demospring.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import ma.jit.demospring.entities.Personne;

@Controller("/personne")
public class PersonneController {
	
	@RequestMapping("/showForm")
	public String helloPersonne(Model model) {
		Personne personne = new Personne("nabila","abrak");
		model.addAttribute("thePersonne", personne);
		return "form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("thePersonner") Personne personne,
			BindingResult theBindingResult) {
		
		if(theBindingResult.hasErrors()) {
			return "form";
		}else return "personne-confirmation";
	}

}
