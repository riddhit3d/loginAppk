package com.cybage.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cybage.entity.User;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

User findByEmail(String email);

    Optional<User> findUserByEmailAndPassword(String email, String password);
//    Optional<User> findByEmail(String email);
}
