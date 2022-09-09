package com.example.demo.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.repository.modelo.VueloSencillo;
import com.example.demo.service.IVueloService;

@Controller
@RequestMapping("/Airlines")
public class AirlinesController {

	@Autowired
	private IVueloService iVueloService;

	@GetMapping("/buscarVuelos/{origen}/{destino}/{fechaVuelo}")
	public String buscarVuelos(Model modelo, @PathVariable("origen") String origen, @PathVariable("destino") String destino,
			@PathVariable("fechaVuelo") String fechaVuelo) {
		LocalDateTime fecha = LocalDateTime.parse(fechaVuelo);
		List<VueloSencillo> listaVuelos = this.iVueloService.buscarVuelos(origen, destino, fecha);
		modelo.addAttribute("vuelos", listaVuelos);
		return "vistaVuelos";
	}

}
