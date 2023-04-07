package com.example.dataSystem.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.dataSystem.models.User;

@Repository
@Transactional
public class UsuarioDaoImp implements UsuarioDao{

    @Override
    public List<User> getUsuarios() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getUsuarios'");
    }
    
}
