package com.example.bettrack.bettrack.services;

import com.example.bettrack.bettrack.domain.user.User;
import com.example.bettrack.bettrack.dtos.UserDTO;
import com.example.bettrack.bettrack.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired

    private UserRepository repository;

    public User findUserById (Long id) {return this.repository.findUserById().orElseThrow(() -> new NotFoundUser());}

    public void saveUser(User user){
        this.repository.save(user);
        System.out.println("Usuário salvo");
    }

    public User createUser(UserDTO data){

        if (repository.existsByDocument(data.document()) || repository.existsByEmail(data.email())) {
            throw new UserAlreadyExistsException();
        }

        User newUser = new User(data);
        this.saveUser(newUser);
        return newUser;
    }

    public List<User> getAllUsers() { return this.repository.findAll();}
}
