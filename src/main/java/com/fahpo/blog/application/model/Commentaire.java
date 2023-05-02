package com.fahpo.blog.application.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class Commentaire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(columnDefinition = "date")
    private LocalDateTime dateTime;

    private String comment ;

    @ManyToOne
    @JsonIgnore
    private Article article;

    @ManyToOne
    private User user;
}
