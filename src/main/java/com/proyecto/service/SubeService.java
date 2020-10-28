package com.proyecto.service;

import com.proyecto.entity.Sube;
import com.proyecto.repository.SubeJPARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Optional;

@Service
public class SubeService {


    @Autowired
    private SubeJPARepository subeJPARepository ;

    public Sube getSubeById(int id) {
        return subeJPARepository.findById(id);
    }

    public Sube putNewSaldo(int id , double newBalance  ){
        Sube sube = subeJPARepository.findById(id);
        sube.addFounds(newBalance);
        return subeJPARepository.save(sube);
    }
}
