package com.zmijewskimaksymilian.social_wall.config;

import com.zmijewskimaksymilian.social_wall.repository.UserRepository;
import com.zmijewskimaksymilian.social_wall.service.UserService;
import com.zmijewskimaksymilian.social_wall.service.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public UserService userService(UserRepository userRepository) {
        return new UserServiceImpl(userRepository);
    }


}
