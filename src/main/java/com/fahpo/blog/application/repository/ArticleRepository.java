package com.fahpo.blog.application.repository;

import com.fahpo.blog.application.model.Article;
import com.fahpo.blog.application.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Integer> {
}
