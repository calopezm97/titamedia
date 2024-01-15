package com.titamedia.prueba.dominio.modelo;

import lombok.Getter;

@Getter
public class Cliente {

    private String nombre;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }


}
