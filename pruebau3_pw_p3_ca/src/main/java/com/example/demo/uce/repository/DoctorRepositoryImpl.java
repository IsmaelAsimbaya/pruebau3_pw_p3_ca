package com.example.demo.uce.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.uce.repository.model.Doctor;

@Repository
@Transactional
public class DoctorRepositoryImpl implements IDoctorRepository{

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public void crear(Doctor doctor) {
		this.em.persist(doctor);
	}

	@Override
	public void actualizar(Doctor doctor) {
		this.em.merge(doctor);
	}

	@Override
	public void eliminar(Integer id) {
		this.em.remove(this.buscar(id));
	}

	@Override
	public Doctor buscar(Integer id) {
		return this.em.find(Doctor.class, id);
	}

}
