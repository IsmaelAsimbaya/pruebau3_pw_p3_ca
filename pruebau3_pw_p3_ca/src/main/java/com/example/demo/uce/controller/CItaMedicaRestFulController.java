package com.example.demo.uce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.uce.repository.model.Cita_Medica;
import com.example.demo.uce.service.ICitaMedicaService;

@RestController
@RequestMapping("/citas_medicas")
public class CItaMedicaRestFulController {

	@Autowired
	private ICitaMedicaService citamedicaService;
	
	@PostMapping
	public String crear(@RequestBody Cita_Medica citaMedica) {
		String mensaje = "Cita Medica insertada correctamente";
		try {
			this.citamedicaService.crear(citaMedica);
		} catch (Exception e) {
			mensaje = "Error intente de nuevo";
		}
		return mensaje;
	}
	
	@PutMapping
	public String actualizar(@RequestBody Cita_Medica citaMedica) {
		this.citamedicaService.actualizar(citaMedica);
		return "Cita Medica Actualizada";
	}
	
	@GetMapping(path = "/citasPendietes")
	public List<Cita_Medica> listarCitasPendientes(@RequestParam(value = "id") Integer id){
		List<Cita_Medica> lista = this.citamedicaService.listaCitasMedicasPendientesDoctorId(id);
		return lista;
	}
	
}
