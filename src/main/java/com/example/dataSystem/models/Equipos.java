package com.example.dataSystem.models;

public class Equipos {
    private String tipo;
    private String marca;
    private String modelo;
    private String num_serie;
    private String dia_ingreso;
    private String mes_ingreso;
    private String annio_ingreso;
    private String observaciones;
    private String status;
    private String ultima_modificacion;
    private String comentarios_tecnico;
    private String revicion_tecnica;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNum_serie() {
        return num_serie;
    }

    public void setNum_serie(String num_serie) {
        this.num_serie = num_serie;
    }

    public String getDia_ingreso() {
        return dia_ingreso;
    }

    public void setDia_ingreso(String dia_ingreso) {
        this.dia_ingreso = dia_ingreso;
    }

    public String getMes_ingreso() {
        return mes_ingreso;
    }

    public void setMes_ingreso(String mes_ingreso) {
        this.mes_ingreso = mes_ingreso;
    }

    public String getAnnio_ingreso() {
        return annio_ingreso;
    }

    public void setAnnio_ingreso(String annio_ingreso) {
        this.annio_ingreso = annio_ingreso;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUltima_modificacion() {
        return ultima_modificacion;
    }

    public void setUltima_modificacion(String ultima_modificacion) {
        this.ultima_modificacion = ultima_modificacion;
    }

    public String getComentarios_tecnico() {
        return comentarios_tecnico;
    }

    public void setComentarios_tecnico(String comentarios_tecnico) {
        this.comentarios_tecnico = comentarios_tecnico;
    }

    public String getRevicion_tecnica() {
        return revicion_tecnica;
    }

    public void setRevicion_tecnica(String revicion_tecnica) {
        this.revicion_tecnica = revicion_tecnica;
    }
}
