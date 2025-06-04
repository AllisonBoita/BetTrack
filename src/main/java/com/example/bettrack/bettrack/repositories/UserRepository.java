package com.example.bettrack.bettrack.repositories;

import com.example.bettrack.bettrack.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findUserByDocument (String document);
    Optional<User> findUserById();

    boolean existsByDocument(String document);
    boolean existsByEmail(String email);
}
