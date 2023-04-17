package com.example.dataSystem.controllers;

import com.example.dataSystem.dao.UsuarioDao;
import com.example.dataSystem.models.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
    private UsuarioDao usuarioDao;

    @RequestMapping(value = "api/login", method = RequestMethod.POST)
    public String login(@RequestBody User usuario) {
        if (usuarioDao.verificarCredenciales(usuario)) {
            return "OK";
        }
        return "FAIL";
    }
}
