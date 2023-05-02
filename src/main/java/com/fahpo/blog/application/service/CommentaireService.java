package com.fahpo.blog.application.service;

import com.fahpo.blog.application.model.Commentaire;
import com.fahpo.blog.application.repository.CommentaireRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CommentaireService {

    private final CommentaireRepository repository;

    public List<Commentaire> getAll(){
        return repository.findAll();
    }

    public Optional<Commentaire> getById(int id) {
        return repository.findById(id);
    }

    public Commentaire create(Commentaire commentaire) {
        return repository.save(commentaire);
    }
    
    public Commentaire update(int id, Commentaire commentaire) {
        commentaire.setId(id);
        return repository.save(commentaire);
    }
    
    public void delete(int id) {
        repository.deleteById(id);
    }
}
