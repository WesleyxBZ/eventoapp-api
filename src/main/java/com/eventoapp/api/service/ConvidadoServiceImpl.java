package com.eventoapp.api.service;

import com.eventoapp.api.model.Convidado;
import com.eventoapp.api.repository.ConvidadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = false)
public class ConvidadoServiceImpl implements ConvidadoService {

    @Autowired
    private ConvidadoRepository convidadoRepository;

    @Override
    public Convidado save(Convidado convidado) {
        return convidadoRepository.save(convidado);
    }

    @Override
    public void deleteById(Long id) {
        convidadoRepository.deleteById(id);
    }

    @Transactional(readOnly = true)
    @Override
    public Optional<Convidado> findById(Long id) {
        return convidadoRepository.findById(id);
    }

    @Transactional(readOnly = true)
    @Override
    public List<Convidado> findAllByEventoId(Long id) {
        return convidadoRepository.findAllByEventoId(id);
    }

    @Override
    public void deleteByEventoId(Long id) {
        convidadoRepository.deleteByEventoId(id);
    }

}
