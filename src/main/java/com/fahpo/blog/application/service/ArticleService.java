package com.fahpo.blog.application.service;

import com.fahpo.blog.application.model.Article;
import com.fahpo.blog.application.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ArticleService {

    private final ArticleRepository repository;

    public List<Article> getAll(){
        return repository.findAll();
    }

    public Optional<Article> getById(int id) {
        return repository.findById(id);
    }

    public Article create(Article article) {
        return repository.save(article);
    }
    
    public Article update(int id, Article article) {
        article.setId(id);
        return repository.save(article);
    }
    
    public void delete(int id) {
        repository.deleteById(id);
    }
}
