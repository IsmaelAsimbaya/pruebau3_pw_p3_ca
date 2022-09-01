package com.example.demo.uce.service.to;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.hateoas.RepresentationModel;

import com.example.demo.uce.repository.model.Cita_Medica;

public class DoctorTo extends RepresentationModel<DoctorTo> implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -447394076268326381L;

	private Integer id;

	private String cedula;
	
	private String nombre;
	
	private String apellido;
	
	private LocalDateTime fechaNacimiento;
	
	private String numeroConsultorio;
	
	private String codigoSenescyt;

	private String genero;
	
	private List<Cita_Medica> citasMedicas;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public LocalDateTime getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNumeroConsultorio() {
		return numeroConsultorio;
	}

	public void setNumeroConsultorio(String numeroConsultorio) {
		this.numeroConsultorio = numeroConsultorio;
	}

	public String getCodigoSenescyt() {
		return codigoSenescyt;
	}

	public void setCodigoSenescyt(String codigoSenescyt) {
		this.codigoSenescyt = codigoSenescyt;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public List<Cita_Medica> getCitasMedicas() {
		return citasMedicas;
	}

	public void setCitasMedicas(List<Cita_Medica> citasMedicas) {
		this.citasMedicas = citasMedicas;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
