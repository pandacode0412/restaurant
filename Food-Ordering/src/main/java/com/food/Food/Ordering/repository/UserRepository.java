package com.food.Food.Ordering.repository;

import com.food.Food.Ordering.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    public User findByEmail(String username);




}
