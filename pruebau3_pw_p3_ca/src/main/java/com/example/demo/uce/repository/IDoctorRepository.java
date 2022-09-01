package com.example.demo.uce.repository;

import com.example.demo.uce.repository.model.Doctor;

public interface IDoctorRepository {

	public void crear(Doctor doctor);

	public void actualizar(Doctor doctor);

	public void eliminar(Integer id);
	
	public Doctor buscar(Integer id);
	
}
