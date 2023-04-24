package com.example.dataSystem.controllers;

import com.example.dataSystem.dao.UsuarioDao;
import com.example.dataSystem.models.User;
import com.example.dataSystem.utils.JWTUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
    @Autowired
    private UsuarioDao usuarioDao;

    @Autowired
    private JWTUtil jwtUtil;

    @RequestMapping(value = "api/login", method = RequestMethod.POST)
    public String login(@RequestBody User usuario) {
        User userLogin = usuarioDao.obtenerUsuarioPorCredenciales(usuario);
        if (userLogin != null) {
            return jwtUtil.create(String.valueOf(userLogin.getId()), userLogin.getUsername());
        }
        return "FAIL";
    }
}
