package com.eventoapp.api.service;

import com.eventoapp.api.model.Evento;
import com.eventoapp.api.repository.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = false)
public class EventoServiceImpl implements EventoService {

    @Autowired
    private EventoRepository eventoRepository;

    @Override
    public Evento createOrUpdate(Evento evento) {
        return eventoRepository.save(evento);
    }

    @Transactional(readOnly = true)
    @Override
    public Optional<Evento> findById(Long id) {
        return eventoRepository.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        eventoRepository.deleteById(id);
    }

    @Override
    public List<Evento> findAllByUsuarioId(Long id) {
        return eventoRepository.findAllByUsuarioId(id);
    }

    @Override
    public Evento findByIdAndUsuarioId(Long idEvento, Long idUsuario) {
        return eventoRepository.findByIdAndUsuarioId(idEvento, idUsuario);
    }

}
