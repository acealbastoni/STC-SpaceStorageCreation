package com.mohamedabdelhamid.demo.service;

import com.mohamedabdelhamid.demo.model.Item;
import com.mohamedabdelhamid.demo.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {
    
    private final ItemRepository itemRepository;
    
    @Autowired
    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }
    
    // Add methods to handle business logic related to items
}
