package com.eventoapp.api.service;

import com.eventoapp.api.model.Usuario;

public interface UsuarioService {

    Usuario createOrUpdate(Usuario usuario);

    void deleteById(Long id);

}
