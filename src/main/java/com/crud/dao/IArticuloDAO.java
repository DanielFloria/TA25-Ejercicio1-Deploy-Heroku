package com.crud.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.dto.Articulo;

public interface IArticuloDAO extends JpaRepository<Articulo, Long>{

}
