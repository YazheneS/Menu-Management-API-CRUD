// File: src/main/java/com/canteen/menu/repository/FoodItemRepository.java
package com.canteen.menu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.canteen.menu.entity.FoodItem;

public interface FoodItemRepository extends JpaRepository<FoodItem, Long> {
}
 