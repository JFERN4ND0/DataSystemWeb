package com.example.dataSystem.controllers;

import com.example.dataSystem.dao.UsuarioDao;
import com.example.dataSystem.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
    @Autowired
    private UsuarioDao usuarioDao;

    @RequestMapping(value = "api/login", method = RequestMethod.POST)
    public boolean login(@RequestBody User usuario) {
        System.out.println(usuario.toString());
        if (usuarioDao.verificarCredenciales(usuario)) {
            return true;
        }
        return false;
    }
}
