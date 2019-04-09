package com.example.ValidacionPersistenciaUsuarios.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "Detalle")
@NamedQuery(name = "TDetalle.findAll", query = "SELECT t FROM TDetalle t")
public class TDetalle implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "latitude")
	private Double latitude;

	@Column(name = "longitude")
	private Double longitude;

	@Column(name = "city")
	private String city;

	@Column(name = "description")
	private String description;

	@ManyToOne
	@JoinColumn(name = "Empleado_id")
	private TEmpleado TEmpleado;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public TEmpleado getTEmpleado() {
		return TEmpleado;
	}

	public void setTEmpleado(TEmpleado tEmpleado) {
		TEmpleado = tEmpleado;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
