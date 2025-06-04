package com.example.bettrack.bettrack.domain.user;

import com.example.bettrack.bettrack.dtos.UserDTO;
import jakarta.persistence.*;
import lombok.*;

@Entity(name = "users")
@Table(name = "users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    @Column (unique = true)
    private String document;
    @Column (unique = true)
    private String email;
    private String password;

    public User(UserDTO data){
        System.out.println("Documento recebido" + data.document());
        this.username = data.username();
        this.document = data.document();
        this.email = data.email();
        this.password = data.password();
    }
}
