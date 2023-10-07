package com.farmacia.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.farmacia.models.Medicamento;
import com.farmacia.services.IMedicamentoService;

import jakarta.validation.Valid;

@Controller
public class MedicamentoController {

	@Autowired IMedicamentoService medServ;
	
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("medicamentos", medServ.listarMedicamentos());
		return "index";
	}
	
	@GetMapping("/agregar")
	public String form(Model model) {
		model.addAttribute("medicamentos", medServ.listarMedicamentos());
		model.addAttribute("medicamento", new Medicamento());
		
		return "form";
	}
	
	
	@PostMapping("/grabar")
	public String grabarPag(@Valid Medicamento medicamento, Errors errores, Model model, RedirectAttributes re) {
		model.addAttribute("medicamentos", medServ.listarMedicamentos());
		if(errores.hasErrors()) {
			return "form";
		}
		
		//re.addFlashAttribute("mensaje", "Alumno Matriculado con exito");
		
		//model.addAttribute("mensaje", "Registro exitoso");
		medServ.agregarMedicamento(medicamento);

		return "redirect:/";
		}
	
}
