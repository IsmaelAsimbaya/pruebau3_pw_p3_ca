package com.example.demo.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.repository.IDoctorRepository;
import com.example.demo.uce.repository.model.Doctor;

@Service
public class DoctorServiceImpl implements IDoctorService{

	@Autowired
	private IDoctorRepository doctorRepository;

	@Override
	public void crear(Doctor doctor) {
		this.doctorRepository.crear(doctor);
	}

	@Override
	public void actualizar(Doctor doctor) {
		this.doctorRepository.actualizar(doctor);
	}

	@Override
	public void eliminar(Integer id) {
		this.doctorRepository.eliminar(id);
	}

	@Override
	public Doctor buscar(Integer id) {
		return this.doctorRepository.buscar(id);
	}
	
	
	
	
	
}
