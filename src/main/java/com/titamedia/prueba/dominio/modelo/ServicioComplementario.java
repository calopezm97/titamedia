package com.titamedia.prueba.dominio.modelo;

import lombok.Getter;

@Getter
public class ServicioComplementario {

    private String nombre;
    private int time;

    public ServicioComplementario(String nombre, int time) {
        this.nombre = nombre;
        this.time = time;
    }


}
