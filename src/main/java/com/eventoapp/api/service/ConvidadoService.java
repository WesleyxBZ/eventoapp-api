package com.eventoapp.api.service;

import com.eventoapp.api.model.Convidado;

import java.util.List;
import java.util.Optional;

public interface ConvidadoService {

    Convidado save(Convidado convidado);

    void deleteById(Long id);

    Optional<Convidado> findById(Long id);

    List<Convidado> findAllByEventoId(Long id);

    void deleteByEventoId(Long id);

}
