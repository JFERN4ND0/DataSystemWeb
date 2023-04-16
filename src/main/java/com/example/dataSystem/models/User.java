package com.example.dataSystem.models;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.security.SecureRandom;

@Entity
@Table(name = "usuarios")
@ToString @EqualsAndHashCode
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
