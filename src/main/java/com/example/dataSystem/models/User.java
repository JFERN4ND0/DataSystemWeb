package com.example.dataSystem.models;

import java.security.SecureRandom;

public class User {
    private int id;
    private String nombre_u;
    private String email_u;
    private String telefono_u;
    private String username;
    private String password;
    private String nivel;
    private String estado;
    private String registradopor;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_u() {
        return nombre_u;
    }

    public void setNombre_u(String nombre_u) {
        this.nombre_u = nombre_u;
    }

    public String getEmail_u() {
        return email_u;
    }

    public void setEmail_u(String email_u) {
        this.email_u = email_u;
    }

    public String getTelefono_u() {
        return telefono_u;
    }

    public void setTelefono_u(String telefono_u) {
        this.telefono_u = telefono_u;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getRegistradopor() {
        return registradopor;
    }

    public void setRegistradopor(String registradopor) {
        this.registradopor = registradopor;
    }
}
