package com.fahpo.blog.application.service;

import com.fahpo.blog.application.model.Category;
import com.fahpo.blog.application.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CategoryService {

    private final CategoryRepository repository;

    public List<Category> getAll(){
        return repository.findAll();
    }

    public Optional<Category> getById(int id) {
        return repository.findById(id);
    }

    public Category create(Category category) {
        return repository.save(category);
    }
    
    public Category update(int id, Category category) {
        category.setId(id);
        return repository.save(category);
    }
    
    public void delete(int id) {
        repository.deleteById(id);
    }
}
