package com.example.dataSystem.dao;

import java.util.List;

import com.example.dataSystem.models.User;

public interface UsuarioDao {
    List<User> getUsuarios();

    void eliminar(int id);
    
    void registrar(User usuario);
}

