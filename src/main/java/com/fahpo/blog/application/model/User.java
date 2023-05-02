package com.fahpo.blog.application.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "utilisateur")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String username;

    @OneToMany
    @JsonIgnore
    private List<Article> articles;

    @OneToMany
    @JsonIgnore
    private List<Commentaire> commentaires;
}
