package com.example.turismosonson;

import java.io.Serializable;

public class Visitar implements Serializable {

    String nombreVisita, infVisita,precioVisita, descripcionVisita ;
    int fotoVisita;


    public Visitar(String nombreVisita, String infVisita, String precioVisita, String descripcionVisita, int fotoVisita) {
        this.nombreVisita = nombreVisita;
        this.infVisita = infVisita;
        this.precioVisita = precioVisita;
        this.descripcionVisita = descripcionVisita;
        this.fotoVisita = fotoVisita;

    }


    public String getNombreVisita() {return nombreVisita; }
    public void setNombreVisita(String nombreVisita) {this.nombreVisita = nombreVisita;  }

    public String getInfVisita() {return infVisita;  }
    public void setInfVisita(String infVisita) {this.infVisita = infVisita;  }

    public String getPrecioVisita() { return precioVisita;  }
    public void setPrecioVisita(String precioVisita) {this.precioVisita = precioVisita; }

    public String getDescripcionVisita() {return descripcionVisita; }
    public void setDescripcionVisita(String descripcionVisita) {this.descripcionVisita = descripcionVisita; }

    public int getFotoVisita() { return fotoVisita; }
    public void setFotoVisita(int fotoVisita) { this.fotoVisita = fotoVisita; }
}
