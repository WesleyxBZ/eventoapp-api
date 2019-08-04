package com.eventoapp.api.model;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.time.LocalTime;
import java.util.Date;

@Entity
@Table(name = "EVENTO")
public class Evento implements Serializable {

    private static final Long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank(message = "Informe um nome")
    @Size(min = 3, max = 60, message = "O nome deve ter entre {min} e {max} caractéres")
    @Column(nullable = false, unique = true, length = 60)
    private String nome;

    @NotBlank(message = "Informe um local")
    @Size(min = 5, max = 60, message = "O local deve ter entre {min} e {max} caractéres")
    @Column(nullable = false, unique = false, length = 60)
    private String local;

    @NotNull
    @DateTimeFormat(iso = ISO.DATE)
    @Column(nullable = false, columnDefinition = "DATE")
    private Date data;

    @NotNull
    @DateTimeFormat(iso = ISO.TIME)
    @Column(nullable = false, columnDefinition = "TIME")
    private LocalTime horario;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public LocalTime getHorario() {
        return horario;
    }

    public void setHorario(LocalTime horario) {
        this.horario = horario;
    }

}
