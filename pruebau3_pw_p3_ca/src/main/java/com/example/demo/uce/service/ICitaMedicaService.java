package com.example.demo.uce.service;

import java.util.List;

import com.example.demo.uce.repository.model.Cita_Medica;

public interface ICitaMedicaService {

	public void crear(Cita_Medica citaMedica);

	public void actualizar(Cita_Medica citaMedica);

	public void eliminar(Integer id);
	
	public Cita_Medica buscar(Integer id);
	
	public List<Cita_Medica> listaCitasMedicasPendientesDoctorId(Integer id);
}
