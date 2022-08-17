package com.crud1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud1.dao.IArticuloDAO;
import com.crud1.dto.Articulo;

@Service
public class ArticuloServiceImpl implements IArticuloService {

	@Autowired
	IArticuloDAO iArticuloDAO;
	
	@Override
	public Articulo guardarArticulo(Articulo articulo) {
		return iArticuloDAO.save(articulo);
	}

	@Override
	public List<Articulo> listarArticulos() {
		return iArticuloDAO.findAll();
	}

	@Override
	public Articulo articuloPorId(Long id) {
		return iArticuloDAO.findById(id).get();
	}

	@Override
	public Articulo actualizarArticulo(Articulo articulo) {
		return iArticuloDAO.save(articulo);
	}

	@Override
	public void borrarArticulo(Long id) {
		iArticuloDAO.deleteById(id);
		
	}
	
}
