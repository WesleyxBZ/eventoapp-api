package com.eventoapp.api.service;

import com.eventoapp.api.model.Evento;

import java.util.List;
import java.util.Optional;

public interface EventoService {

    Evento save(Evento evento);

    List<Evento> findAll();

    Optional<Evento> findById(Long id);

    void deleteById(Long id);

}
