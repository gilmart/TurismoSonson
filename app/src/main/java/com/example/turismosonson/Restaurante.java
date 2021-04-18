package com.example.turismosonson;

import java.io.Serializable;

public class Restaurante implements Serializable {

    String nombreRestaurante;
    String infRestaurante;
    String precio;
    String descripcionRestaurante;
    int fotoRestaurante;

    public Restaurante(String nombreRestaurante, String infRestaurante, String precio, String descripcionRestaurante, int fotoRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
        this.infRestaurante = infRestaurante;
        this.precio = precio;
        this.fotoRestaurante = fotoRestaurante;
        this.descripcionRestaurante = descripcionRestaurante;
    }

    public String getNombreRestaurante() { return nombreRestaurante; }
    public void setNombreRestaurante(String nombreRestaurante) { this.nombreRestaurante = nombreRestaurante; }

    public String getInfRestaurante() {
        return infRestaurante;
    }
    public void setInfRestaurante(String infRestaurante) {
        this.infRestaurante = infRestaurante;
    }

    public String getPrecio() { return precio; };
    public void setPrecio(String precio) { this.precio = precio;  }

    public String getDescripcionRestaurante() {return descripcionRestaurante;}
    public void setDescripcionRestaurante(String descripcionRestaurante) { this.descripcionRestaurante = descripcionRestaurante;}

    public int getFotoRestaurante() {return fotoRestaurante; }
    public void setFotoRestaurante(int fotoRestaurante) { this.fotoRestaurante = fotoRestaurante; }


}

