package com.example.dataSystem.models;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "clientes")
@ToString @EqualsAndHashCode
public class Clientes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter @Column(name = "id_cliente")
    private int id_cliente;
    @Getter @Setter @Column(name = "nombre_cliente")
    private String nombre_c;
    @Getter @Setter @Column(name = "mail_cliente")
    private String email_c;
    @Getter @Setter @Column(name = "tel_cliente")
    private String telefono_c;
    @Getter @Setter @Column(name = "dir_cliente")
    private String direction;
    @Getter @Setter @Column(name = "ultima_modificacion")
    private String ultima_modificacion;

}
