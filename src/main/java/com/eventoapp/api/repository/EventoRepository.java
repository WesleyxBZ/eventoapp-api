package com.eventoapp.api.repository;

import com.eventoapp.api.model.Evento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventoRepository extends JpaRepository<Evento, Long> {

    List<Evento> findAllByUsuarioId(Long id);

    Evento findByIdAndUsuarioId(Long idEvento, Long idUsuario);

}
