package com.example.ValidacionPersistenciaUsuarios.modelo;

import java.util.List;

public class Empleado {

	private String nombre;
	private String apellidos;
	private String correo;
	private int edad;
	private String fechaContratacion;
	private List<Marcador> marcadores;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getFechaContratacion() {
		return fechaContratacion;
	}

	public void setFechaContratacion(String fechaContratacion) {
		this.fechaContratacion = fechaContratacion;
	}

	public List<Marcador> getMarcadores() {
		return marcadores;
	}

	public void setMarcadores(List<Marcador> marcadores) {
		this.marcadores = marcadores;
	}

}