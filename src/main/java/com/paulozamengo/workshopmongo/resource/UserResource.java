package com.paulozamengo.workshopmongo.resource;

import com.paulozamengo.workshopmongo.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value="/users")
public class UserResource {

        @GetMapping
        public ResponseEntity<List<User>> findAll() {
            User maria = new User("1", "Maria", "maria@gmail.com");
            User joao = new User("2", "Joao", "joao@gmail.com");

            List<User> result = new ArrayList<>();
            result.addAll(Arrays.asList(maria, joao));
            return ResponseEntity.ok().body(result);
        }
}