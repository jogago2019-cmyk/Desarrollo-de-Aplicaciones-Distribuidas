package com.distribuidos.Autos.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Auto {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;
	 private String puerta;
	 private String patente;
	 private String color;
	 private int modelo;
	 private Double precio;
	 
	 public Auto() {}
	 
	 public Auto(Long id, String puerta, String patente, String color, int modelo, Double precio) {
		super();
		this.id = id;
		this.puerta = puerta;
		this.patente = patente;
		this.color = color;
		this.modelo = modelo;
		this.precio = precio;
	 }

	 public Long getId() {
		 return id;
	 }

	 public void setId(Long id) {
		 this.id = id;
	 }

	 public String getPuerta() {
		 return puerta;
	 }

	 public void setPuerta(String puerta) {
		 this.puerta = puerta;
	 }

	 public String getPatente() {
		 return patente;
	 }

	 public void setPatente(String patente) {
		 this.patente = patente;
	 }

	 public String getColor() {
		 return color;
	 }

	 public void setColor(String color) {
		 this.color = color;
	 }

	 public int getModelo() {
		 return modelo;
	 }

	 public void setModelo(int modelo) {
		 this.modelo = modelo;
	 }

	 public Double getPrecio() {
		 return precio;
	 }

	 public void setPrecio(Double precio) {
		 this.precio = precio;
	 }
	 
	 
}
