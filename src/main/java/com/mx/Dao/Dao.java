package com.mx.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mx.Dominio.Patitas;
@Repository
public interface Dao extends JpaRepository<Patitas, Integer> {

}
