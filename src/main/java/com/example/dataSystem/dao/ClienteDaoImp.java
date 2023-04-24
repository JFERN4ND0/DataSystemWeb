package com.example.dataSystem.dao;

import com.example.dataSystem.models.Clientes;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class ClienteDaoImp implements ClienteDao{

    @PersistenceContext
    private EntityManager entityManager;
    private Clientes cliente;

    @Override
    @Transactional
    public List<Clientes> getClientes() {
        String query = "FROM Clientes";
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public void registrarCliente(Clientes cliente) {
        entityManager.merge(cliente);
    }
}
