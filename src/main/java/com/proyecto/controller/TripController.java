package com.proyecto.controller;

import com.proyecto.data.TripWithoutId;
import com.proyecto.entity.Trip;
import com.proyecto.service.TripService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class TripController {

    @Autowired
    private TripService tripService;

    @GetMapping("/trips/{id}")
    List<TripWithoutId> get(@PathVariable Integer id) {
        List<Trip> listTripWithID = tripService.getTripByIdSube(id);
        return convertTrips(listTripWithID);
    }

    List<TripWithoutId> convertTrips(List<Trip> listTrip) {
        return listTrip.stream().map(trip -> new TripWithoutId(trip)).collect(Collectors.toList());

    }

}
