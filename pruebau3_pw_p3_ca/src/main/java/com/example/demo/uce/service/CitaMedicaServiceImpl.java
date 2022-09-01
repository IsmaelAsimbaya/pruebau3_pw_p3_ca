package com.example.demo.uce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.repository.ICitasMedicasRepository;
import com.example.demo.uce.repository.model.Cita_Medica;

@Service
public class CitaMedicaServiceImpl implements ICitaMedicaService {
	
	@Autowired
	private ICitasMedicasRepository citaMedicaRepository;

	@Override
	public void crear(Cita_Medica citaMedica) {
		this.citaMedicaRepository.crear(citaMedica);
	}

	@Override
	public void actualizar(Cita_Medica citaMedica) {
		this.citaMedicaRepository.actualizar(citaMedica);
	}

	@Override
	public void eliminar(Integer id) {
		this.citaMedicaRepository.eliminar(id);
	}

	@Override
	public Cita_Medica buscar(Integer id) {
		return this.citaMedicaRepository.buscar(id);
	}

	@Override
	public List<Cita_Medica> listaCitasMedicasPendientesDoctorId(Integer id) {
		return this.citaMedicaRepository.listaCitasMedicasPendientesDoctorId(id);
	}
	
	
	

}
