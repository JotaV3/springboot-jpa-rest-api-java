package com.jotav3.springboot_jpa_rest_api.resources;

import com.jotav3.springboot_jpa_rest_api.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User user = new User(3L, "joão", "joao@gmail.com", "999999", "1234");

        return ResponseEntity.ok().body(user);
    }
}
