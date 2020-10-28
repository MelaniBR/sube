package com.proyecto.service;

import com.proyecto.entity.Sube;
import com.proyecto.entity.Trip;
import com.proyecto.repository.SubeJPARepository;
import com.proyecto.repository.TripJPARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TripService {
    @Autowired
    private TripJPARepository tripJPARepository ;

    public Trip getTripByIdSube(int id) {
        return tripJPARepository.findByIdSube(id);
    }
}
