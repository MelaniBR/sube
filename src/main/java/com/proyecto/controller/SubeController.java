package com.proyecto.controller;

import com.proyecto.entity.Sube;
import com.proyecto.service.SubeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/subes")
public class SubeController {

    @Autowired
    private SubeService subeService;

    @GetMapping
    List<Sube> getAll() {
        return subeService.getAllSube();

    }

    @GetMapping("/{id}")
    Sube get(@PathVariable Integer id) {
        return subeService.getSubeById(id);

    }

    @PutMapping("/{id}/cargarSube")
    Sube put(@PathVariable Integer id, @RequestBody Sube sube) {
        return subeService.putNewSaldo(id, sube);

    }

}
