package com.example.personal_daybook.controller;

import com.example.personal_daybook.model.Tab;
import com.example.personal_daybook.repository.TabRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tabs")
public class TabController {
    private final TabRepository tabRepository;
    public TabController(TabRepository tabRepository) {
        this.tabRepository = tabRepository;
    }
    @GetMapping
    public List<Tab> findAll() {
        return tabRepository.findAll();
    }
}
