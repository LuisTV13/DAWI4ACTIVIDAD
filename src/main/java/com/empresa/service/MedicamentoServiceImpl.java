package com.empresa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.empresa.entity.Medicamento;

import com.empresa.repository.MedicamentoRepository;

@Service
public class MedicamentoServiceImpl implements MedicamentoService{

	@Autowired
	private MedicamentoRepository repository;

	@Override
	public List<Medicamento> listaMedicamento() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Medicamento insertaActualizaMedicamento(Medicamento obj) {
		// TODO Auto-generated method stub
		return repository.save(obj);
	}

	@Override
	public Optional<Medicamento> buscaPorId(int idMedicamento) {
		// TODO Auto-generated method stub
		return repository.findById(idMedicamento);
	}

	@Override
	public void eliminaPorId(int idMedicamento) {
		// TODO Auto-generated method stub
		repository.deleteById(idMedicamento);
	}

	@Override
	public List<Medicamento> buscaPorNombre(String nombre) {
		// TODO Auto-generated method stub
		return repository.findByNombre(nombre);
	}	
	
	



}
