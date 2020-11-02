package com.proyecto.controller;

import com.proyecto.entity.Trip;
import com.proyecto.service.TripService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TripController {
    @Autowired
    private TripService tripService ;


    @GetMapping("/trips/{id}")
    List<Trip> get(@PathVariable Integer id ){

        return tripService.getTripByIdSube(id);
    }
}
