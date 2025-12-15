package com.canteen.menu.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.canteen.menu.dto.FoodItemDTO;
import com.canteen.menu.entity.FoodItem;
import com.canteen.menu.repository.FoodItemRepository;

@Service
public class FoodItemService {

    private final FoodItemRepository repository;

    public FoodItemService(FoodItemRepository repository) {
        this.repository = repository;
    }

    public FoodItem createItem(FoodItemDTO dto) {
        FoodItem item = new FoodItem();
        item.setName(dto.getName());
        item.setPrice(dto.getPrice());
        item.setCategory(dto.getCategory());
        item.setAvailability(dto.getAvailability());
        return repository.save(item);
    }

    public List<FoodItem> getAllItems() {
        return repository.findAll();
    }

    public FoodItem updateItem(Long id, FoodItemDTO dto) {
        FoodItem item = repository.findById(id).orElse(null);
        if (item == null) {
            return null;
        }
        item.setName(dto.getName());
        item.setPrice(dto.getPrice());
        item.setCategory(dto.getCategory());
        item.setAvailability(dto.getAvailability());
        return repository.save(item);
    }

    public void deleteItem(Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
        }
    }
}
