package com.titamedia.prueba.dominio.modelo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Descuento {

    private String nombre;
    private double porcentaje;

    public Descuento(String nombre, double porcentaje) {
        this.nombre = nombre;
        this.porcentaje = porcentaje;
    }


}
