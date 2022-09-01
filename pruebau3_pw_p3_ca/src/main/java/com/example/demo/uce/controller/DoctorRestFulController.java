package com.example.demo.uce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.uce.repository.model.Doctor;
import com.example.demo.uce.service.IDoctorService;

@RestController
@RequestMapping("/doctores")
public class DoctorRestFulController {
	
	@Autowired
	private IDoctorService doctorService;
	
	@PostMapping
	public String crear(@RequestBody Doctor doctor) {
		String mensaje = "Doctor insertado correctamente";
		try {
			this.doctorService.crear(doctor);
		} catch (Exception e) {
			mensaje = "Error intente de nuevo";
		}
		return mensaje;
	}
	
	@PutMapping
	public String actualizar(@RequestBody Doctor doctor) {
		this.doctorService.actualizar(doctor);
		return "Doctor Actualizado";
	}
	
	@GetMapping(path = "/{idDoctor}")
	public ResponseEntity<Doctor> buscarEstudiante(@PathVariable("idDoctor") Integer id) {
		Doctor doc = this.doctorService.buscar(id);
		return ResponseEntity.ok(doc);
	}
	
	@DeleteMapping(path = "{idDoctor}")
	public String eliminar(@PathVariable("idDoctor") Integer id) {
		this.doctorService.eliminar(id);
		return "Doctor eliminado";
	}
	

}
