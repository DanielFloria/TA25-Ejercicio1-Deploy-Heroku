package com.crud1.service;

import java.util.List;

import com.crud1.dto.Fabricante;

public interface IFabricanteService {
	public Fabricante guardarFabricante(Fabricante fabricante);
	
	public List<Fabricante> listarFabricantes();
	
	public Fabricante fabricantePorId(Long id);
	
	public Fabricante actualizarFabricante(Fabricante fabricante);
	
	public void borrarFabricante(Long id);
}
