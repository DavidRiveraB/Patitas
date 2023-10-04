package com.mx.Dominio;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "PATITAS")

public class Patitas {
	
	
	/*ID_VETERINARIO NUMBER,
    APP_PATERNO NVARCHAR2(20),
    APP_MATERNO NVARCHAR2(20),
    NOMBRES NVARCHAR2(20),
    CEDULA_PROFESIONAL NVARCHAR2(30),*/
	
	@Id
	@Column
	(name="ID_VETERINARIO", columnDefinition = "NUMBER")
	private int idVeterinario;
	@Column(name="APP_PATERNO", columnDefinition = "NVHARCHAR2(20)")
	private String appPaterno;
	@Column(name="APP_MATERNO", columnDefinition = "NVHARCHAR2(20)")
	private String appMaterno;
	@Column(name="NOMBREs", columnDefinition = "NVHARCHAR2(20)")
	private String nombres; 
	@Column(name="CEDULA_PROFESIONAL", columnDefinition = "NVHARCHAR2(30)")
	private int cedulaProfesional;
	
	
	public Patitas() {
	}


	public Patitas(int idVeterinario, String appPaterno, String appMaterno, String nombres, int cedulaProfesional) {
		this.idVeterinario = idVeterinario;
		this.appPaterno = appPaterno;
		this.appMaterno = appMaterno;
		this.nombres = nombres;
		this.cedulaProfesional = cedulaProfesional;
	}


	@Override
	public String toString() {
		return "Patitas [idVeterinario=" + idVeterinario + ", appPaterno=" + appPaterno + ", appMaterno=" + appMaterno
				+ ", nombres=" + nombres + ", cedulaProfesional=" + cedulaProfesional + "]";
	}


	public int getIdVeterinario() {
		return idVeterinario;
	}


	public void setIdVeterinario(int idVeterinario) {
		this.idVeterinario = idVeterinario;
	}


	public String getAppPaterno() {
		return appPaterno;
	}


	public void setAppPaterno(String appPaterno) {
		this.appPaterno = appPaterno;
	}


	public String getAppMaterno() {
		return appMaterno;
	}


	public void setAppMaterno(String appMaterno) {
		this.appMaterno = appMaterno;
	}


	public String getNombres() {
		return nombres;
	}


	public void setNombres(String nombres) {
		this.nombres = nombres;
	}


	public int getCedulaProfesional() {
		return cedulaProfesional;
	}


	public void setCedulaProfesional(int cedulaProfesional) {
		this.cedulaProfesional = cedulaProfesional;
	}
	
}
