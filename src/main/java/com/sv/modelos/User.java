package com.sv.modelos;

import java.sql.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="uni", catalog="webfinal", schema="")
public class User {

	@Id
	@Column
	private String seed;
	@Column
	private String texto;
	public String getSeed() {
		return seed;
	}
	public void setSeed(String seed) {
		this.seed = seed;
	}
	public String getTexto() {
		
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	
	
	
	
	
	/*@Column
	private String nit;
	@Column
	private String nombre_cliente;
	@Column
	private String producto;
	
	public Integer getId() {
		return id;
	}
	
	public Date getFecha() {
		return fecha;
	}
	
	public String getNit() {
		return nit;
	}
	public void setNit(String nit) {
		this.nit = nit;
	}
	public String getNombre_cliente() {
		return nombre_cliente;
	}
	public void setNombre_cliente(String nombre_cliente) {
		this.nombre_cliente = nombre_cliente;
	}
	public String getProducto() {
		return producto;
	}
	public void setProducto(String producto) {
		this.producto = producto;
	}*/


}
