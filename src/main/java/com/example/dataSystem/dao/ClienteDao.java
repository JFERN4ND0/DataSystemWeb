package com.example.dataSystem.dao;

import com.example.dataSystem.models.Clientes;

import java.util.List;

public interface ClienteDao {
    List<Clientes> getClientes();

    void registrarCliente(Clientes cliente);
}
