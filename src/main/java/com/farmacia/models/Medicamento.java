package com.farmacia.models;

import java.util.Date;

import jakarta.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "medicamento")
public class Medicamento {
	@Id
	@Column(name = "id_medicamento")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "nombre")
	@NotBlank(message = "El Nombre no puede estar vacio")
	private String nombre;
	
	@NotBlank(message = "La Descripcion no puede estar vacia")
	@Column(name = "descripcion")
	private String descripcion;
	
	@NotBlank(message = "La Categoria no puede estar vacia")
	@Column(name = "categoria")
	private String categoria;
	

	@Column(name = "precio")
	@NotNull(message = "El Precio no puede estar vacio")
	private Double precio;
	

	@Column(name = "stock")
	@NotNull(message = "El stock no puede estar vacio")
	private Integer stock;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "fecha_vencimiento")
	private Date fechaVencimiento;
	
	@NotBlank(message = "El Proveedor no puede estar vacio")
	@Column(name = "proveedor")
	private String proveedor;
	
	
	
	public Medicamento() {
	}
	
	public Medicamento(Integer id, String nombre, String descripcion, String categoria, Double precio,
			Integer stock, Date fechaVencimiento, String proveedor) {
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.categoria = categoria;
		this.precio = precio;
		this.stock = stock;
		this.fechaVencimiento = fechaVencimiento;
		this.proveedor = proveedor;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public Date getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(Date fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public String getProveedor() {
		return proveedor;
	}

	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}
	
	
	

}

  