package com.mohamedabdelhamid.demo.repository;

import com.mohamedabdelhamid.demo.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
    // Add custom query methods if needed
}
