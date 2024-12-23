package com.zmijewskimaksymilian.social_wall.service;

import com.zmijewskimaksymilian.social_wall.entity.User;

public interface UserService {
    User getUserByEmail(String email);
}
