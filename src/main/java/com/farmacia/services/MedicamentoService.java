package com.farmacia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.farmacia.dao.IMedicamento;
import com.farmacia.models.Medicamento;

@Service
public class MedicamentoService implements IMedicamentoService{

	@Autowired IMedicamento iMedicamento;
	
	@Override
	@Transactional(readOnly = true)
	public List<Medicamento> listarMedicamentos() {		
		return (List<Medicamento>)iMedicamento.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public void agregarMedicamento(Medicamento id) {
		iMedicamento.save(id);
	}

}
