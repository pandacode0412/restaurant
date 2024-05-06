package com.food.Food.Ordering.service;

import com.food.Food.Ordering.dto.RestaurantDto;
import com.food.Food.Ordering.model.Restaurant;
import com.food.Food.Ordering.model.User;
import com.food.Food.Ordering.request.CreateRestaurantRequest;

import java.util.List;

public interface RestaurantService {

    public Restaurant createRestaurant(CreateRestaurantRequest req , User user);


    public Restaurant updateRestaurant(Long restaurantId , CreateRestaurantRequest updatedRestaurant) throws  Exception;

    public void deleteRestaurant(Long restaurantId) throws  Exception;

    public List<Restaurant> getAllRestaurant();

    public List<Restaurant> searchRestaurant(String keyword);

    public Restaurant findRestaurantById(Long id) throws Exception;

    public Restaurant getRestaurantByUserId(Long userId) throws  Exception;

    public RestaurantDto addToFavorites(Long restaurantId , User user) throws Exception;

    public Restaurant updateRestaurantStatus(Long id) throws Exception;



}
