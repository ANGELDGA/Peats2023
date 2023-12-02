package com.example.demo.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "animalss")
public class Pets {
	@Id // unique+not null
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(nullable = false)
	private String name;

	@Column(nullable = false)
	private String tipo;

	@Column(nullable = false)
	private String raza;

	@Column(nullable = false)
	private String ubicacion;

	@Column(nullable = false)
	private String descripcion;

	@Column(nullable = false)
	private String imagenPath;

	@Column(nullable = false)
	private LocalDate fechaDesaparicion;

	@Column(nullable = false)
	private String estado;

	@Column(nullable = false)
	private String contactos;

	public Pets() {
	}

	public Pets(int id, String name, String tipo, String raza, String ubicacion, String descripcion, String imagenPath,
			LocalDate fechaDesaparicion, String estado, String contactos) {
		this.id = id;
		this.name = name;
		this.tipo = tipo;
		this.raza = raza;
		this.ubicacion = ubicacion;
		this.descripcion = descripcion;
		this.imagenPath = imagenPath;
		this.fechaDesaparicion = fechaDesaparicion;
		this.estado = estado;
		this.contactos = contactos;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getImagenPath() {
		return imagenPath;
	}

	public void setImagenPath(String imagenPath) {
		this.imagenPath = imagenPath;
	}

	public LocalDate getFechaDesaparicion() {
		return fechaDesaparicion;
	}

	public void setFechaDesaparicion(LocalDate fechaDesaparicion) {
		this.fechaDesaparicion = fechaDesaparicion;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getContactos() {
		return contactos;
	}

	public void setContactos(String contactos) {
		this.contactos = contactos;
	}

}
