// File: src/main/java/com/canteen/menu/exception/ItemNotFoundException.java
package com.canteen.menu.exception;

public class ItemNotFoundException extends RuntimeException {
    public ItemNotFoundException(Long id) {
        super("Food item not found with ID: " + id);
    }
}
