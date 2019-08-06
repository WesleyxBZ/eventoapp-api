package com.eventoapp.api.controller;

import com.eventoapp.api.model.Convidado;
import com.eventoapp.api.service.ConvidadoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/convidado")
@CrossOrigin(origins = "*")
public class ConvidadoController {

    @Autowired
    private ConvidadoService convidadoService;

    @PostMapping
    public Convidado createOrUpdate(@RequestBody Convidado convidado, BindingResult result) {

        if (result.hasErrors()) {
            System.out.println(result);
            return null;
        }

        return convidadoService.createOrUpdate(convidado);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteById(@PathVariable("id") Long id) {
        convidadoService.deleteById(id);
    }

    @GetMapping("/findConvidadosByEvento/{id}")
    public List<Convidado> findConvidadosByEventoId(@PathVariable("id") Long id) {
        return convidadoService.findAllByEventoId(id);
    }

}
