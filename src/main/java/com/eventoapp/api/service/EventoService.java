package com.eventoapp.api.service;

import com.eventoapp.api.model.Evento;

import java.util.List;
import java.util.Optional;

public interface EventoService {

    Evento createOrUpdate(Evento evento);

    Optional<Evento> findById(Long id);

    void deleteById(Long id);

    List<Evento> findAllByUsuarioId(Long id);

    Evento findByIdAndUsuarioId(Long idEvento, Long idUsuario);

}
