package com.leandro.festa.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.leandro.festa.model.Convidado;
import com.leandro.festa.repository.Convidados;

@Controller
public class ConvidadosController {

	@Autowired
	private Convidados convidados;
	
	@GetMapping("/convidados")
	public ModelAndView listar() {
		List<Convidado> c = convidados.findAll();
		Map<String, Convidado> aC = new HashMap<>();
		
		for (Convidado currentC : c) {
			aC.put("convidados", currentC);
		}
		
		ModelAndView mav = new ModelAndView("ListaConvidados", aC);
		
		return mav;
	}
}
