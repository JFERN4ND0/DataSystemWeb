package com.example.dataSystem.models;

public class Clientes {
    private String nombre_c;
    private String email_c;
    private String direction;
    private String ultima_modificacion;

    public String getNombre_c() {
        return nombre_c;
    }

    public void setNombre_c(String nombre_c) {
        this.nombre_c = nombre_c;
    }

    public String getEmail_c() {
        return email_c;
    }

    public void setEmail_c(String email_c) {
        this.email_c = email_c;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getUltima_modificacion() {
        return ultima_modificacion;
    }

    public void setUltima_modificacion(String ultima_modificacion) {
        this.ultima_modificacion = ultima_modificacion;
    }
}
