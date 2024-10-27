package com.halloweenCodeChallenge.ApiMonster.controller;

import com.halloweenCodeChallenge.ApiMonster.model.Monstruo;
import com.halloweenCodeChallenge.ApiMonster.service.MonstruosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/monstruos")
public class MonstruosController {
    @Autowired
    private MonstruosService service;

    @GetMapping
    public List<Monstruo> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Monstruo getById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    public Monstruo create(@RequestBody Monstruo monstruo) {
        return service.save(monstruo);
    }

    @PutMapping("/{id}")
    public Monstruo update(@PathVariable Long id, @RequestBody Monstruo monstruo) {
        Monstruo existing = service.findById(id);
        existing.setNombre(monstruo.getNombre());
        existing.setTipo(monstruo.getTipo());
        existing.setNivelAmenaza(monstruo.getNivelAmenaza());
        existing.setDescripcion(monstruo.getDescripcion());
        return service.save(existing);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.deleteById(id);
    }
}
