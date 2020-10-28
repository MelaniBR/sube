package com.proyecto.repository;


import com.proyecto.entity.Trip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public
interface TripJPARepository extends JpaRepository<Trip, Serializable> {
    Trip findByIdSube(int id) ;


}

