// File: src/main/java/com/canteen/menu/dto/FoodItemDTO.java
package com.canteen.menu.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class FoodItemDTO {

    @NotBlank(message = "Item name cannot be blank")
    private String name;

    @Min(value = 1, message = "Price must be greater than zero")
    private Double price;

    @NotBlank(message = "Category cannot be blank")
    private String category;

    private Boolean availability;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Double getPrice() { return price; }
    public void setPrice(Double price) { this.price = price; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public Boolean getAvailability() { return availability; }
    public void setAvailability(Boolean availability) { this.availability = availability; }
}
