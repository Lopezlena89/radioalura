package com.aluracursos.radioalura.modelos;

public class Podcast extends Audio{

    private String presentador;
    private String descripcion;

    public String getPresentador() {
        return presentador;
    }

    public void setPresentador(String presentados) {
        this.presentador = presentados;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
