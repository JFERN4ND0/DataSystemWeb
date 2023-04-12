package com.example.dataSystem.controllers;

import com.example.dataSystem.dao.UsuarioDao;
import com.example.dataSystem.models.User;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioDao usuarioDao;

    @RequestMapping(value = "api/usuarios/{id}", method = RequestMethod.GET)
    public User getUsuario(@PathVariable int id) {
        User usuario = new User();
        usuario.setId(id);
        usuario.setNombre_u("Lucas");
        usuario.setEmail_u("lucasmoy@hotmail.com");
        usuario.setTelefono_u("9514852588");
        usuario.setUsername("LucasM");
        usuario.setPassword("123456");
        usuario.setNivel("Capturista");
        usuario.setEstado("Activo");
        usuario.setRegistradopor("Fernando");

        return usuario;
    }

    @RequestMapping(value = "api/usuarios", method = RequestMethod.POST)
    public void registrarUsuarios(@RequestBody User usuario) {
        usuarioDao.registrar(usuario);
    }

    /* 
    ~   comentado porque no se requiere eliminar por la aplicación
    */
    // @RequestMapping(value = "api/usuarios/{id}", method = RequestMethod.DELETE)
    // public void eliminarUsuario(@PathVariable int id) {
    //     usuarioDao.eliminar(id);
    // }

    @RequestMapping(value = "usuario12")
    public User buscarUsuario() {
        User usuario = new User();
        usuario.setNombre_u("Lucas");
        usuario.setEmail_u("lucasmoy@hotmail.com");
        usuario.setTelefono_u("9514852588");
        usuario.setUsername("LucasM");
        usuario.setPassword("123456");
        usuario.setNivel("Capturista");
        usuario.setEstado("Activo");
        usuario.setRegistradopor("Fernando");

        return usuario;
    }
}
