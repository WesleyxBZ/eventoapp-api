package com.eventoapp.api.repository;

import com.eventoapp.api.model.Convidado;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ConvidadoRepository extends CrudRepository<Convidado, Long> {

    List<Convidado> findAllByEventoId(Long id);

    void deleteByEventoId(Long id);

}
