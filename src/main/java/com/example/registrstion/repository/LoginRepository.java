package com.example.registrstion.repository;





import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.registrstion.entities.Login;

import java.util.Optional;

@Repository
public interface LoginRepository extends CrudRepository<Login,Long> {
    //Iterable<Login> findByUsername(String username);
}