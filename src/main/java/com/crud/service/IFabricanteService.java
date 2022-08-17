package com.crud.service;

import java.util.List;

import com.crud.dto.Fabricante;

public interface IFabricanteService {
	public Fabricante guardarFabricante(Fabricante fabricante);
	
	public List<Fabricante> listarFabricantes();
	
	public Fabricante fabricantePorId(Long id);
	
	public Fabricante actualizarFabricante(Fabricante fabricante);
	
	public void borrarFabricante(Long id);
}
