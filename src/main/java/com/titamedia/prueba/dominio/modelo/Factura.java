package com.titamedia.prueba.dominio.modelo;

import lombok.Getter;

@Getter
public class Factura {

    private Producto producto;
    private Cliente cliente;
    private Descuento descuento;
    private ServicioComplementario servicioComplementario;
    private int cantidad;
    private double precio;

    public Factura(int cantidad, Producto producto, Cliente cliente, Object beneficio, double precio) {
        this.producto = producto;
        this.cliente = cliente;
        if (beneficio.getClass() == Descuento.class) {
            this.descuento = (Descuento) beneficio;
        }
        else {
            this.servicioComplementario = (ServicioComplementario) beneficio;
        }
        this.cantidad = cantidad;
        this.precio = precio;
    }
}
