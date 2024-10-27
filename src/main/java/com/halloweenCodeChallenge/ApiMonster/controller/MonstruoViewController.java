package com.halloweenCodeChallenge.ApiMonster.controller;

import com.halloweenCodeChallenge.ApiMonster.model.Monstruo;
import com.halloweenCodeChallenge.ApiMonster.service.MonstruosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/monstruos")
public class MonstruoViewController {
    @Autowired
    private MonstruosService service;

    @GetMapping
    public String getAll(Model model) {
        List<Monstruo> monstruos = service.findAll();
        model.addAttribute("monstruos", monstruos);
        return "list"; // Nombre de la vista para listar monstruos
    }

    @GetMapping("/new")
    public String createForm(Model model) {
        model.addAttribute("monstruo", new Monstruo());
        return "new"; // Nombre de la vista para agregar nuevo monstruo
    }

    @PostMapping
    public String create(@ModelAttribute Monstruo monstruo) {
        service.save(monstruo);
        return "redirect:/monstruos"; // Redirige a la lista de monstruos después de crear
    }

    @GetMapping("/edit/{id}")
    public String editForm(@PathVariable Long id, Model model) {
        Monstruo monstruo = service.findById(id);
        model.addAttribute("monstruo", monstruo);
        return "edit"; // Nombre de la vista para editar monstruo
    }

    @PostMapping("/{id}")
    public String update(@PathVariable Long id, @ModelAttribute Monstruo monstruo) {
        monstruo.setId(id);
        service.save(monstruo);
        return "redirect:/monstruos"; // Redirige a la lista de monstruos después de editar
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        service.deleteById(id);
        return "redirect:/monstruos"; // Redirige a la lista de monstruos después de eliminar
    }
}
