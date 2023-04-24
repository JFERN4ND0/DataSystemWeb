package com.example.dataSystem.controllers;

import com.example.dataSystem.dao.UsuarioDao;
import com.example.dataSystem.models.User;

import java.util.List;
import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;
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

    @RequestMapping(value = "api/usuarios", method = RequestMethod.GET)
    public List<User> getUsuarios() {
        return usuarioDao.getUsuarios();
    }

    @RequestMapping(value = "api/rusuarios", method = RequestMethod.POST)
    public void registrarUsuario(@RequestBody User usuario) {
        Argon2 argon2 = Argon2Factory.create(Argon2Factory.Argon2Types.ARGON2id);
        String hash = argon2.hash(1, 1024, 1, usuario.getPassword());
        usuario.setPassword(hash);
        usuarioDao.registrar(usuario);
    }

    /*
     * ~ comentado porque no se requiere eliminar por la aplicación
     */
    // @RequestMapping(value = "api/usuarios/{id}", method = RequestMethod.DELETE)
    // public void eliminarUsuario(@PathVariable int id) {
    // usuarioDao.eliminar(id);
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
