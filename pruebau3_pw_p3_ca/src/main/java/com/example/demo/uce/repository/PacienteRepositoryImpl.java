package com.example.demo.uce.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.uce.repository.model.Paciente;

@Repository
@Transactional
public class PacienteRepositoryImpl implements IPacienteRepository{
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public void crear(Paciente paciente) {
		this.em.persist(paciente);
	}

	@Override
	public void actualizar(Paciente paciente) {
		this.em.merge(paciente);
	}

	@Override
	public void eliminar(Integer id) {
		this.em.remove(this.buscar(id));
	}

	@Override
	public Paciente buscar(Integer id) {
		return this.em.find(Paciente.class, id);
	}

	@Override
	public Paciente buscarPorCedula(String cedula) {
		TypedQuery<Paciente> myQuery = this.em.createQuery("SELECT p FROM Paciente p WHERE p.cedula = :cedulaDato",Paciente.class);
		myQuery.setParameter("cedulaDato", cedula);
		return myQuery.getSingleResult();
	}
	
	

}
