package com.proyecto.service;

import com.proyecto.entity.Trip;
import com.proyecto.repository.TripRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TripService {

    @Autowired
    private TripRepository tripRepository;

    public List<Trip> getTripByIdSube(int id) {
        return tripRepository.findByIdSube(id);
    }

}
