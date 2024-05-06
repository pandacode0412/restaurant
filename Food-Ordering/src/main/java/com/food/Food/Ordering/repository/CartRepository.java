package com.food.Food.Ordering.repository;

import com.food.Food.Ordering.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Long> {
}
