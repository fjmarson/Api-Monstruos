package com.halloweenCodeChallenge.ApiMonster.service;

import com.halloweenCodeChallenge.ApiMonster.model.Monstruo;
import com.halloweenCodeChallenge.ApiMonster.repository.MonstruosRepository; // Asegúrate de que la importación sea correcta
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List; // Asegúrate de importar java.util.List

@Service
public class MonstruosService {
    @Autowired
    private MonstruosRepository repository;

    public List<Monstruo> findAll() {
        return repository.findAll();
    }

    public Monstruo findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Monstruo save(Monstruo monstruo) {
        return repository.save(monstruo);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
