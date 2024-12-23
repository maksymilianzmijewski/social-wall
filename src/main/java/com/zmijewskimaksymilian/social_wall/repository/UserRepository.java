package com.zmijewskimaksymilian.social_wall.repository;

import com.zmijewskimaksymilian.social_wall.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Integer> {
    Optional<User> findByEmail(String email);
}
