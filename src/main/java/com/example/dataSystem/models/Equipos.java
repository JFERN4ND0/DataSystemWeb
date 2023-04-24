package com.example.dataSystem.models;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "equipos")
@ToString @EqualsAndHashCode
public class Equipos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter @Column(name = "id_equipo")
    private int id_equipo;
    @Getter @Setter @Column(name = "id_cliente")
    private int id_cliente;
    @Getter @Setter @Column(name = "tipo_equipo")
    private String tipo;
    @Getter @Setter @Column(name = "marca")
    private String marca;
    @Getter @Setter @Column(name = "modelo")
    private String modelo;
    @Getter @Setter @Column(name = "num_serie")
    private String num_serie;
    @Getter @Setter @Column(name = "dia_ingreso")
    private String dia_ingreso;
    @Getter @Setter @Column(name = "mes_ingreso")
    private String mes_ingreso;
    @Getter @Setter @Column(name = "annio_ingreso")
    private String annio_ingreso;
    @Getter @Setter @Column(name = "observaciones")
    private String observaciones;
    @Getter @Setter @Column(name = "estatus")
    private String status;
    @Getter @Setter @Column(name = "ultima_modificacion")
    private String ultima_modificacion;
    @Getter @Setter @Column(name = "comentarios_tecnicos")
    private String comentarios_tecnico;
    @Getter @Setter @Column(name = "revision_tecnica")
    private String revicion_tecnica;
}
