package com.fahpo.blog.application.controller;

import com.fahpo.blog.application.model.Commentaire;
import com.fahpo.blog.application.service.CommentaireService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/commentaires")
public class CommentaireController {
    private final CommentaireService service;

    @GetMapping
    public ResponseEntity<List<Commentaire>> findAll() {
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Commentaire>> findById(@PathVariable int id) {
        return new ResponseEntity<>(service.getById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Commentaire> createCommentaire(@RequestBody Commentaire commentaire) {
        return new ResponseEntity<>(service.create(commentaire), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Commentaire> update(@PathVariable int id, @RequestBody Commentaire commentaire) {
        return new ResponseEntity<>(service.update(id, commentaire), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable int id) {
        service.delete(id);
        return ResponseEntity.ok("Deleted");
    }
}
