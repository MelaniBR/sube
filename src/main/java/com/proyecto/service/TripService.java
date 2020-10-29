package com.proyecto.service;

import com.proyecto.entity.Sube;
import com.proyecto.entity.Trip;
import com.proyecto.repository.SubeJPARepository;
import com.proyecto.repository.TripJPARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TripService {
    @Autowired
    private TripJPARepository tripJPARepository ;

    public List<Trip> getTripByIdSube(int id) {
        return tripJPARepository.findByIdSube(id);
    }
}
