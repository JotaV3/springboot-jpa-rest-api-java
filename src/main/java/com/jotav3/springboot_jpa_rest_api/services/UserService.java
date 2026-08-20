package com.jotav3.springboot_jpa_rest_api.services;

import com.jotav3.springboot_jpa_rest_api.entities.User;
import com.jotav3.springboot_jpa_rest_api.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public List<User> findAll(){
        return repository.findAll();
    }

    public User findById(Long id){
        Optional<User> optional = repository.findById(id);
        return optional.get();
    }

    public User insert(User user){
        return repository.save(user);
    }

    public User update(Long id, User userDataUpdate){
        User user = repository.getReferenceById(id);
        updateUserData(user, userDataUpdate);

        return repository.save(user);
    }

    public void delete(Long id){
        repository.deleteById(id);
    }

    private void updateUserData(User user, User userDataUpdate){
        user.setName(userDataUpdate.getName());
        user.setEmail(userDataUpdate.getEmail());
        user.setPhone(userDataUpdate.getPhone());
    }
}
