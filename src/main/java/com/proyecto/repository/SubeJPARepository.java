package com.proyecto.repository;

import com.proyecto.entity.Sube;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface SubeJPARepository extends JpaRepository<Sube, Serializable> {

   Sube findById(int id);

}
