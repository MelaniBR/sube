package com.proyecto.service;

import com.proyecto.entity.Sube;
import com.proyecto.exceptionHandling.SubeException;
import com.proyecto.repository.SubeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubeService {

    @Autowired
    private SubeRepository subeRepository;

    public List<Sube> getAllSube() {
        return subeRepository.findAll();
    }

    public Sube getSubeById(int id) {
        return subeRepository.findById(id);
    }

    public Sube putNewSaldo(int id, Sube sube)  {
        Sube subeLookFor = subeRepository.findById(id);
        idDontBelongToAnySube(subeLookFor, id);
        return subeRepository.save(sube);
    }

    public void idDontBelongToAnySube(Sube sube, int id)  {

        if (sube == null) {
            new SubeException("This ID: " + id +" IS DONT BELONG TO ANY SUBE ");
        }
    }

}
