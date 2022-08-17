package com.crud1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud1.dao.IFabricanteDAO;
import com.crud1.dto.Fabricante;

@Service
public class FabricanteServiceImpl implements IFabricanteService {

	@Autowired
	IFabricanteDAO iFabricanteDAO;
	
	@Override
	public Fabricante guardarFabricante(Fabricante fabricante) {
		return iFabricanteDAO.save(fabricante);
	}

	@Override
	public List<Fabricante> listarFabricantes() {
		return iFabricanteDAO.findAll();
	}

	@Override
	public Fabricante fabricantePorId(Long id) {
		return iFabricanteDAO.findById(id).get();
	}

	@Override
	public Fabricante actualizarFabricante(Fabricante fabricante) {
		return iFabricanteDAO.save(fabricante);
	}

	@Override
	public void borrarFabricante(Long id) {
		iFabricanteDAO.deleteById(id);
		
	}

}
