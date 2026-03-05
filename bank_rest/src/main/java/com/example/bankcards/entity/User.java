package com.example.bankcards.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="user_id")
    private Integer id;
    @OneToMany(mappedBy = "user")
    private List<Card> cards;
    @Column(name="role")
    @Enumerated(EnumType.STRING)
    private Role role;
    @Column
    private String phone;
    @Column
    private String firstname;
    @Column
    private String secondname;

}
