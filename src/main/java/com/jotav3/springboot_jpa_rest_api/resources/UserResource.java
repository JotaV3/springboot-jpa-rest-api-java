package com.jotav3.springboot_jpa_rest_api.resources;

import com.jotav3.springboot_jpa_rest_api.entities.User;
import com.jotav3.springboot_jpa_rest_api.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserResource {
    @Autowired
    private UserService service;

    @GetMapping
    public ResponseEntity<List<User>> findAll(){
        List<User> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id){
        User user = service.findById(id);
        return ResponseEntity.ok().body(user);
    }

    @PostMapping
    public ResponseEntity<User> insert(@RequestBody User user){
        user = service.insert(user);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(user.getId()).toUri();

        return ResponseEntity.created(uri).body(user);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<User> update(@PathVariable Long id, @RequestBody User user){
        user = service.update(id, user);
        return ResponseEntity.ok().body(user);
    }
}
