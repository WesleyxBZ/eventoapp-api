package com.eventoapp.api.controller;

import com.eventoapp.api.model.Evento;
import com.eventoapp.api.service.ConvidadoService;
import com.eventoapp.api.service.EventoService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/evento")
@CrossOrigin(origins = "*")
@Api
public class EventoController {

    @Autowired
    private EventoService eventoService;

    @Autowired
    private ConvidadoService convidadoService;

    @PostMapping
    public Evento createOrUpdate(@RequestBody Evento evento, BindingResult result) {

        if (result.hasErrors()) {
            return null;
        }

        return eventoService.createOrUpdate(evento);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") Long id) {
        convidadoService.deleteByEventoId(id);
        eventoService.deleteById(id);
    }

    @GetMapping("/{id}")
    public List<Evento> findAllByUsuarioId(@PathVariable("id") Long id) {
        return eventoService.findAllByUsuarioId(id);
    }

    @GetMapping("/{id_evento}/{id_usuario}")
    public Evento findByIdAndUsuarioId(@PathVariable("id_evento") Long idEvento, @PathVariable("id_usuario") Long idUsuario) {
        return eventoService.findByIdAndUsuarioId(idEvento, idUsuario);
    }

}
