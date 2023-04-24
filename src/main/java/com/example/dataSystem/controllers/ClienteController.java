package com.example.dataSystem.controllers;

import com.example.dataSystem.dao.ClienteDao;
import com.example.dataSystem.models.Clientes;
import com.example.dataSystem.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClienteController {

    @Autowired
    private ClienteDao clienteDao;

    @RequestMapping(value = "api/tClientes", method = RequestMethod.GET)
    public List<Clientes> getClientes() {
        return clienteDao.getClientes();
    }

    @RequestMapping(value = "api/rCliente", method = RequestMethod.POST)
    public void registrarCliente(@RequestBody Clientes cliente) {
        clienteDao.registrarCliente(cliente);
    }
}
