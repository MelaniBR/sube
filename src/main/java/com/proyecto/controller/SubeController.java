package com.proyecto.controller;
import com.proyecto.entity.Sube;
import com.proyecto.service.SubeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.List;


@RestController
public class SubeController {
    //controller advice
    @Autowired
    private SubeService subeService ;

    @GetMapping("/subes")
    List<Sube> getAll(){
        return subeService.getAllSube();
    }

    @GetMapping("/sube/{id}")
    Sube get(@PathVariable Integer id ) throws Exception {
        if (id == 10) {
            throw new Exception();			}
        return subeService.getSubeById(id);
    }
    @PutMapping("/sube/{id}/cargarSube")
    Sube put(@PathVariable Integer id ,@RequestBody BigDecimal newBalance) throws Exception {

        return subeService.putNewSaldo(id,newBalance);
    }
}
