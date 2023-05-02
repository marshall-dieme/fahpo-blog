package com.fahpo.blog.application.service;

import com.fahpo.blog.application.model.User;
import com.fahpo.blog.application.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class UserService {

    private final UserRepository repository;

    public List<User> getAll(){
        return repository.findAll();
    }

    public Optional<User> getById(int id) {
        return repository.findById(id);
    }

    public User create(User user) {
        return repository.save(user);
    }

    public User update(int id, User user) {
        user.setId(id);
        return repository.save(user);
    }

    public void delete(int id) {
        repository.deleteById(id);
    }
}
