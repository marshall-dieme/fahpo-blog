package com.fahpo.blog.application.controller;

import com.fahpo.blog.application.model.Article;
import com.fahpo.blog.application.service.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/articles")
public class ArticleController {
    private final ArticleService service;

    @GetMapping
    public ResponseEntity<List<Article>> findAll() {
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Article>> findById(@PathVariable int id) {
        return new ResponseEntity<>(service.getById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Article> createArticle(@RequestBody Article article) {
        return new ResponseEntity<>(service.create(article), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Article> update(@PathVariable int id, @RequestBody Article article) {
        return new ResponseEntity<>(service.update(id, article), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable int id) {
        service.delete(id);
        return ResponseEntity.ok("Deleted");
    }
}
