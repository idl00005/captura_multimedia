package com.example.g116;

import java.util.ArrayList;

public class UsuariosRegistrados {
    ArrayList<User> usuarios = new ArrayList<>();
    void anadir_Usuario(User usuario){
        usuarios.add(usuario);
    }
    User comprobar_Usuario_Registrado(String nombre_usuario, String clave){
        for (User usuario : usuarios) {
            if ( (usuario.getNombre_usuario().equals(nombre_usuario) || usuario.getEmail().equals(nombre_usuario) )
                    && usuario.getClave().equals(clave)){
                return usuario;
            }
        }
        return null;
    }
}
