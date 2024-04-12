package model.dao;

import model.validator.User;

import java.util.List;

public interface UserDAO {
     public List<User> buscaTodos();
     public void update(User user);
     public void nuevoUsuario(User user);
     public int size();

     public User findUserByUsername(String username);
}
