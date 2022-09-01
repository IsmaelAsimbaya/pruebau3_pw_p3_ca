package com.example.demo.uce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.uce.repository.model.Paciente;
import com.example.demo.uce.service.IPacienteService;

@RestController
@RequestMapping("/pacientes")
public class PacienteRestFulController {

	@Autowired
	private IPacienteService pacienteService;
	
	@PostMapping
	public String crear(@RequestBody Paciente paciente) {
		String mensaje = "Paciente insertado correctamente";
		try {
			this.pacienteService.crear(paciente);
		} catch (Exception e) {
			mensaje = "Error intente de nuevo";
		}
		return mensaje;
	}
	
	@GetMapping(path = "/cedulas")
	public Paciente buscarPorCedula(@RequestParam(value = "ci") String ci) {
		System.out.println(ci);
		return this.pacienteService.buscarPorCedula(ci);
	}
	
	
}
