package com.titamedia.prueba.dominio.modelo;

import lombok.Getter;

@Getter
public class Producto {

    private String nombre;
    private int cantidad;
    private double precio;

    public Producto(String nombre, int cantidad, double precio) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }


}
