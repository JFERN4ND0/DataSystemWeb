package com.example.dataSystem.controllers;

import com.example.dataSystem.models.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {

    @RequestMapping(value = "usuario/{id}")
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

    @RequestMapping(value = "usuario")
    public User editarUsuario() {
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

    @RequestMapping(value = "usuario2")
    public User eliminarUsuario() {
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
