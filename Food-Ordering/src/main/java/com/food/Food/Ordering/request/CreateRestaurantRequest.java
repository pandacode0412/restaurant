package com.food.Food.Ordering.request;

import com.food.Food.Ordering.model.Address;
import com.food.Food.Ordering.model.ContactInformation;
import lombok.Data;

import java.util.List;

@Data
public class CreateRestaurantRequest {

    private Long id;
    private String name;
    private String description;
    private String cuisineType;
    private Address address;
    private ContactInformation contactInformation;
    private String opingHours;
    private List<String> images;
}
