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

import com.crud.dto.Articulo;
import com.crud.service.ArticuloServiceImpl;

@RestController
@RequestMapping("/api")
public class ArticuloController {

	@Autowired
	ArticuloServiceImpl articuloServiceImpl;

	@PostMapping("/articulos")
	public Articulo guardarArticulo(@RequestBody Articulo articulo) {
		return articuloServiceImpl.guardarArticulo(articulo);
	}

	@GetMapping("/articulos")
	public List<Articulo> listarArticulos() {
		return articuloServiceImpl.listarArticulos();
	}

	@GetMapping("/articulos/{id}")
	public Articulo articuloPorId(@PathVariable(name="codigo") Long id) {
		Articulo articuloPorId = new Articulo();
		articuloPorId = articuloServiceImpl.articuloPorId(id);

		System.out.println("Articulo por id: " + articuloPorId);

		return articuloPorId;
	}	

	@PutMapping("/articulos/{id}")
	public Articulo actualizarArticulo(@PathVariable(name="codigo") Long id, @RequestBody Articulo articulo) {
		Articulo articuloSeleccionado = new Articulo();
		Articulo articuloActualizado = new Articulo();

		articuloSeleccionado = articuloServiceImpl.articuloPorId(id);

		articuloSeleccionado.setNombre(articulo.getNombre());
		articuloSeleccionado.setPrecio(articulo.getPrecio());
		articuloSeleccionado.setFabricante(articulo.getFabricante());

		articuloActualizado = articuloServiceImpl.actualizarArticulo(articuloSeleccionado);

		return articuloActualizado;
	}

	@DeleteMapping("/articulos/{id}")
	public void borrarArticulo(@PathVariable(name="codigo") Long id) {
		articuloServiceImpl.borrarArticulo(id);
	}

}
