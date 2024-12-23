package com.zmijewskimaksymilian.social_wall.service;

import com.zmijewskimaksymilian.social_wall.entity.User;
import com.zmijewskimaksymilian.social_wall.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.NoSuchElementException;


public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User getUserByEmail(String email) throws NoSuchElementException {
        return userRepository.findByEmail(email)
                .orElseThrow();
    }
}
