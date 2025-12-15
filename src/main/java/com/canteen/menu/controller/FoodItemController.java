package com.canteen.menu.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.canteen.menu.dto.FoodItemDTO;
import com.canteen.menu.entity.FoodItem;
import com.canteen.menu.service.FoodItemService;

@RestController
@RequestMapping("/api/items")
public class FoodItemController {

    private final FoodItemService service;

    public FoodItemController(FoodItemService service) {
        this.service = service;
    }

    @PostMapping
    public FoodItem create(@RequestBody FoodItemDTO dto) {
        return service.createItem(dto);
    }

    @GetMapping
    public List<FoodItem> getAll() {
        return service.getAllItems();
    }

    @PutMapping("/{id}")
    public ResponseEntity<FoodItem> update(@PathVariable Long id, @RequestBody FoodItemDTO dto) {
        FoodItem updated = service.updateItem(id, dto);
        if (updated == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.deleteItem(id);
        return ResponseEntity.ok().build();
    }
}
