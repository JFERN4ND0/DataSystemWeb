package com.example.dataSystem.dao;

import java.util.List;

import com.example.dataSystem.models.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class UsuarioDaoImp implements UsuarioDao{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public List<User> getUsuarios() {
        String query = "FROM User";
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public void eliminar(int id) {
        User usuario = entityManager.find(User.class, id);
        entityManager.remove(usuario);
    }

    @Override
    public void registrar(User usuario) {
        entityManager.merge(usuario);
    }

    @Override
    public boolean verificarCredenciales(@NotNull User usuario) {
        String query = "FROM User WHERE username = :username AND password = :password";
        List<User> lista = entityManager.createQuery(query)
                .setParameter("username", usuario.getUsername())
                .setParameter("password", usuario.getPassword())
                .getResultList();

        return !lista.isEmpty();
    }
}
