package com.farmacia.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.farmacia.models.Medicamento;

public interface IMedicamento extends JpaRepository<Medicamento, Integer>{

}
