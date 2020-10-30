package com.proyecto.service;

import com.proyecto.entity.Sube;
import com.proyecto.repository.SubeJPARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
public class SubeService {


    @Autowired
    private SubeJPARepository subeJPARepository;

    public List<Sube> getAllSube() {
        return subeJPARepository.findAll();
    }

    public Sube getSubeById(int id) {
        return subeJPARepository.findById(id);
    }

    public Sube putNewSaldo(int id, BigDecimal newBalance) throws Exception {
        Sube sube = subeJPARepository.findById(id);
        idDontBelongToAnySube(sube,id);
        sube.addFounds(newBalance);
        return subeJPARepository.save(sube);
    }

    public void idDontBelongToAnySube(Sube sube,int id) throws Exception {
        if (sube == null) {
            throw new Exception("This ID: " + id +" IS DONT BELONG TO ANY SUBE ");
        }
    }


}
