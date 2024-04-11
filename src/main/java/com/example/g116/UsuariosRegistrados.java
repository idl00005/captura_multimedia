package com.example.g116;

import model.dao.UserDAOJpa;
import model.validator.User;

import java.util.ArrayList;
import java.util.List;

public class UsuariosRegistrados {
    public List<User> usuarios = new ArrayList<>();

    public void anadir_Usuario(User usuario){
        usuarios.add(usuario);
    }

}
