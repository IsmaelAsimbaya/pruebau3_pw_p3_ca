package com.example.demo.uce.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.uce.repository.model.Cita_Medica;

@Repository
@Transactional
public class CitaMedicaRepositoryImpl implements ICitasMedicasRepository{
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public void crear(Cita_Medica citaMedica) {
		this.em.persist(citaMedica);
	}

	@Override
	public void actualizar(Cita_Medica citaMedica) {
		this.em.merge(citaMedica);
	}

	@Override
	public void eliminar(Integer id) {
		this.em.remove(this.buscar(id));
	}

	@Override
	public Cita_Medica buscar(Integer id) {
		return this.em.find(Cita_Medica.class, id);
	}

	@Override
	public List<Cita_Medica> listaCitasMedicasPendientesDoctorId(Integer id) {
		TypedQuery<Cita_Medica> myQuery = this.em.createQuery("SELECT cm FROM Cita_Medica cm WHERE cm.doctor.id = :idDoctor",Cita_Medica.class);
		myQuery.setParameter("idDoctor", id);
		return myQuery.getResultList();
	}
	
	
}
