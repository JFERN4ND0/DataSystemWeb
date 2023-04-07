package com.example.dataSystem.controllers;

import com.example.dataSystem.models.User;

import java.util.ArrayList;
import java.util.List;

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

    @RequestMapping(value = "usuarios")
    public List<User> getUsuarios() {
        List<User> usuarios = new ArrayList<>();
        User usuario = new User();
        usuario.setId(125);
        usuario.setNombre_u("Loki");
        usuario.setEmail_u("lucasmoy@hotmail.com");
        usuario.setTelefono_u("9514852588");
        usuario.setUsername("LucasM");
        usuario.setPassword("123456");
        usuario.setNivel("Capturista");
        usuario.setEstado("Activo");
        usuario.setRegistradopor("Fernando");
        
        User usuario2 = new User();
        usuario2.setId(145);
        usuario2.setNombre_u("Lucas2");
        usuario2.setEmail_u("lucasmoy@hotmail.com");
        usuario2.setTelefono_u("9514852588");
        usuario2.setUsername("LucasM");
        usuario2.setPassword("123456");
        usuario2.setNivel("Capturista");
        usuario2.setEstado("Activo");
        usuario2.setRegistradopor("Fernando");
        
        User usuario3= new User();
        usuario3.setId(156);
        usuario3.setNombre_u("Lucas3");
        usuario3.setEmail_u("lucasmoy@hotmail.com");
        usuario3.setTelefono_u("9514852588");
        usuario3.setUsername("LucasM");
        usuario3.setPassword("123456");
        usuario3.setNivel("Capturista");
        usuario3.setEstado("Activo");
        usuario3.setRegistradopor("Fernando");

        usuarios.add(usuario);
        usuarios.add(usuario2);
        usuarios.add(usuario3);

        return usuarios;
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
