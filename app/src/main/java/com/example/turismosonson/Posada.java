package com.example.turismosonson;

import java.io.Serializable;

public class Posada implements Serializable {

    String nombrePosada;
    String infPosada;
    String precioPosada;
    String descripcionPosada;
    int fotoPosada;

    public Posada(String nombrePosada, String infPosada, String precioPosada, String descripcionPosada, int fotoPosada) {
        this.nombrePosada = nombrePosada;
        this.infPosada = infPosada;
        this.precioPosada = precioPosada;
        this.descripcionPosada = descripcionPosada;
        this.fotoPosada = fotoPosada;
    }

    public String getNombrePosada() { return nombrePosada; }
    public void setNombrePosada(String nombrePosada) {this.nombrePosada = nombrePosada;}

    public String getInfPosada() {return infPosada;}
    public void setInfPosada(String infPosada) {this.infPosada = infPosada;}

    public String getPrecioPosada() {return precioPosada;}
    public void setPrecioPosada(String precioPosada) {this.precioPosada = precioPosada;}

    public String getDescripcionPosada() {return descripcionPosada;}
    public void setDescripcionPosada(String descripcionPosada) {this.descripcionPosada = descripcionPosada;}

    public int getFotoPosada() {return fotoPosada;}
    public void setFotoPosada(int fotoPosada) {this.fotoPosada = fotoPosada; }


}
