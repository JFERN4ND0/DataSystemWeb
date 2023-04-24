package com.example.dataSystem.dao;

import java.util.ArrayList;
import java.util.List;

import com.example.dataSystem.models.User;
import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class UsuarioDaoImp implements UsuarioDao {

    @PersistenceContext
    private EntityManager entityManager;
    private User usuario;

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
    public void registrarUser(User usuario) {
        entityManager.merge(usuario);
    }

    @Override
    public User obtenerUsuarioPorCredenciales(User usuario) {
        String query = "FROM User WHERE username = :username";
        List<User> lista = entityManager.createQuery(query)
                .setParameter("username", usuario.getUsername())
                .getResultList();

        if (lista.isEmpty()) return null;
        String passwordHashed = lista.get(0).getPassword();

        Argon2 argon2 = Argon2Factory.create(Argon2Factory.Argon2Types.ARGON2id);
        if (argon2.verify(passwordHashed, usuario.getPassword()))
            return lista.get(0);
        return null;
    }
}
