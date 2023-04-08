package com.example.dataSystem.dao;

import java.util.List;

import com.example.dataSystem.models.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class UsuarioDaoImp implements UsuarioDao{

    @Override
    public List<User> getUsuarios() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getUsuarios'");
    }
    
}
