package com.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.dto.Fabricante;
import com.crud.service.FabricanteServiceImpl;

@RestController
@RequestMapping("/api")
public class FabricanteController {
	
	@Autowired
	FabricanteServiceImpl fabricanteServiceImpl;
	
	@PostMapping("/fabricantes")
	public Fabricante guardarFabricante(@RequestBody Fabricante fabricante) {
		return fabricanteServiceImpl.guardarFabricante(fabricante);
	}
	
	@GetMapping("/fabricantes")
	public List<Fabricante> listarFabricantes() {
		return fabricanteServiceImpl.listarFabricantes();
	}
	
	@GetMapping("/fabricantes/{id}")
	public Fabricante fabricantePorId(@PathVariable(name="codigo") Long id) {
		Fabricante fabricantePorId = new Fabricante();
		fabricantePorId = fabricanteServiceImpl.fabricantePorId(id);
		
		System.out.println("Fabricante por id: " + fabricantePorId);
		
		return fabricantePorId;
	}	
	
	@PutMapping("/fabricantes/{id}")
	public Fabricante actualizarFabricante(@PathVariable(name="codigo") Long id, @RequestBody Fabricante fabricante) {
		Fabricante fabricanteSeleccionado = new Fabricante();
		Fabricante fabricanteActualizado = new Fabricante();
		
		fabricanteSeleccionado = fabricanteServiceImpl.fabricantePorId(id);
		
		fabricanteSeleccionado.setNombre(fabricante.getNombre());
		
		fabricanteActualizado = fabricanteServiceImpl.actualizarFabricante(fabricanteSeleccionado);
		
		return fabricanteActualizado;
	}
	
	@DeleteMapping("/fabricantes/{id}")
	public void borrarFabricante(@PathVariable(name="codigo") Long id) {
		fabricanteServiceImpl.borrarFabricante(id);
	}
}
