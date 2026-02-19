package com.example.personal_daybook.repository;

import com.example.personal_daybook.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
