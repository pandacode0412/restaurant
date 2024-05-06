package com.food.Food.Ordering.service;

import com.food.Food.Ordering.model.User;

public interface UserService {
    public User findUserByJwtToken(String jwt) throws Exception ;

    public User findUserByEmail(String email) throws  Exception;


}
