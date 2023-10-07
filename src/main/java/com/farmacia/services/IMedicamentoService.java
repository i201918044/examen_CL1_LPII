package com.farmacia.services;

import java.util.List;

import com.farmacia.models.Medicamento;



public interface IMedicamentoService{
 
	public List<Medicamento> listarMedicamentos();
	public void agregarMedicamento(Medicamento id);
}
