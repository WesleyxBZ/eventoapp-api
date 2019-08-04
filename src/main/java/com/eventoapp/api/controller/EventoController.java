package com.eventoapp.api.controller;

import com.eventoapp.api.model.Evento;
import com.eventoapp.api.service.ConvidadoService;
import com.eventoapp.api.service.EventoService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/eventoapp/evento")
@CrossOrigin(origins = "*")
@Api
public class EventoController {

    @Autowired
    private EventoService eventoService;

    @Autowired
    private ConvidadoService convidadoService;

    @PostMapping
    public Evento save(@RequestBody Evento evento, BindingResult result) {

        if (result.hasErrors()) {
            return null;
        }

        return eventoService.save(evento);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") Long id) {
        convidadoService.deleteByEventoId(id);
        eventoService.deleteById(id);
    }

    @GetMapping
    public List<Evento> findAll() {
        return eventoService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Evento> findById(@PathVariable("id") Long id) {
        return eventoService.findById(id);
    }

}
