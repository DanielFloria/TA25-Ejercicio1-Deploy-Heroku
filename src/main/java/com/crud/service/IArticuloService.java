package com.crud.service;

import java.util.List;

import com.crud.dto.Articulo;

public interface IArticuloService {
	public Articulo guardarArticulo(Articulo articulo);
	
	public List<Articulo> listarArticulos();
	
	public Articulo articuloPorId(Long id);
	
	public Articulo actualizarArticulo(Articulo articulo);
	
	public void borrarArticulo(Long id);

}