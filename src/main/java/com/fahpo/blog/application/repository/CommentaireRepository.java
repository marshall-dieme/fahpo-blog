package com.fahpo.blog.application.repository;

import com.fahpo.blog.application.model.Commentaire;
import com.fahpo.blog.application.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentaireRepository extends JpaRepository<Commentaire, Integer> {
}
