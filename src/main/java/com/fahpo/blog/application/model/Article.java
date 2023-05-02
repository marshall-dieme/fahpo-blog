package com.fahpo.blog.application.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String titre;

    private String contenu;

    @ManyToOne
    @JsonIgnore
    private User auteur;

    @ManyToOne
    private Category category;

    @OneToMany
    private List<Commentaire> commentaires;
}
