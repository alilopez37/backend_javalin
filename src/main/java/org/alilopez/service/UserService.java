package org.alilopez.users.service;

import org.alilopez.users.model.User;
import org.alilopez.users.repository.UserRepository;

import java.sql.SQLException;
import java.util.List;

public class UserService {
    private final UserRepository userRepo = new UserRepository();

    public List<User> getAllUsers() throws SQLException {
        return userRepo.findAll();
    }

    public void createUser(User user) throws SQLException {
        // Podrías validar aquí si el email ya existe, etc.
        userRepo.save(user);
    }
}
