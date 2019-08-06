package com.eventoapp.api.controller;

import com.eventoapp.api.model.Usuario;
import com.eventoapp.api.repository.UsuarioRepository;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/usuario")
@CrossOrigin(origins = "*")
@Api
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @PostMapping
    public Usuario createOrUpdate(@RequestBody Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable("id") Long id) {
        usuarioRepository.deleteById(id);
    }

}
