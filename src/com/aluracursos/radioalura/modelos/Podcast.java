package com.aluracursos.radioalura.modelos;

public class Podcast extends Audio{

    private String presentados;
    private String descripcion;

    public String getPresentados() {
        return presentados;
    }

    public void setPresentados(String presentados) {
        this.presentados = presentados;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
