package com.example.dataSystem.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.security.SecureRandom;

@Entity
@Table(name = "usuarios")
public class User {

    @Id
    @Getter @Setter @Column(name = "id_usuario")
    private int id;
    @Getter @Setter @Column(name = "nombre_usuario")
    private String nombre_u;
    @Getter @Setter @Column(name = "email")
    private String email_u;
    @Getter @Setter @Column(name = "telefono")
    private String telefono_u;
    @Getter @Setter @Column(name = "username")
    private String username;
    @Getter @Setter @Column(name = "password")
    private String password;
    @Getter @Setter @Column(name = "tipo_nivel")
    private String nivel;
    @Getter @Setter @Column(name = "estatus")
    private String estado;
    @Getter @Setter @Column(name = "registrado_por")
    private String registradopor;

}
