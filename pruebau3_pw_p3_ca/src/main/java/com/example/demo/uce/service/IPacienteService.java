package com.example.demo.uce.service;

import com.example.demo.uce.repository.model.Paciente;

public interface IPacienteService {

	public void crear(Paciente paciente);

	public void actualizar(Paciente paciente);

	public void eliminar(Integer id);
	
	public Paciente buscar(Integer id);
	
	public Paciente buscarPorCedula(String cedula);
}
