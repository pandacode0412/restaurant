package com.food.Food.Ordering.service;

import com.food.Food.Ordering.model.Category;

import java.util.List;

public interface CategoryService {

    public Category createCategory(String name, Long userId) throws Exception;

    public List<Category> findCategoryByRestaurantId(Long id ) throws Exception;

    public Category findCategoryById(Long id) throws Exception;
}
