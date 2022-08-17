package com.crud1.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud1.dto.Articulo;

public interface IArticuloDAO extends JpaRepository<Articulo, Long>{

}
