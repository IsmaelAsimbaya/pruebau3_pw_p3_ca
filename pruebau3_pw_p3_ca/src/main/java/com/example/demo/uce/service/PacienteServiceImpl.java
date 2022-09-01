package com.example.demo.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.repository.IPacienteRepository;
import com.example.demo.uce.repository.model.Paciente;

@Service
public class PacienteServiceImpl implements IPacienteService {

	@Autowired
	private IPacienteRepository pacienteRepository;
	
	@Override
	public void crear(Paciente paciente) {
		this.pacienteRepository.crear(paciente);
	}

	@Override
	public void actualizar(Paciente paciente) {
		this.pacienteRepository.actualizar(paciente);
	}

	@Override
	public void eliminar(Integer id) {
		this.pacienteRepository.eliminar(id);
	}

	@Override
	public Paciente buscar(Integer id) {
		return this.pacienteRepository.buscar(id);
	}

	@Override
	public Paciente buscarPorCedula(String cedula) {
		return this.pacienteRepository.buscarPorCedula(cedula);
	}
	

}
