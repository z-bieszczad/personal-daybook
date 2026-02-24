package com.example.personal_daybook.controller;
import com.example.personal_daybook.repository.TabRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.ArrayList;

@Controller
public class HomeController {
    public final TabRepository tabRepository;
    private final List<String> ideas = new ArrayList<>();
    private final List<String> tasks = new ArrayList<>();
    private final List<String> shoppingList = new ArrayList<>();

    public HomeController(TabRepository tabRepository) {
        this.tabRepository = tabRepository;
    }


    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("tabs", tabRepository.findAll());
        model.addAttribute("ideas", ideas);
        model.addAttribute("tasks", tasks);
        model.addAttribute("shoppingList", shoppingList);
        return "home";
    }
    @PostMapping("/addIdea")
    public String addIdea(@RequestParam String idea) {
        if(!idea.isBlank()) {
            tasks.add(idea);
        }
        return "redirect:/";
    }

    @PostMapping("/addTask")
    public String addTask(@RequestParam String task){
        if(!task.isBlank()) {
            tasks.add(task);
        }
        return "redirect:/";
    }

    @PostMapping("/addShopping")
    public String addShopping(@RequestParam String item) {
        if (!item.isBlank()) shoppingList.add(item);
        return "redirect:/";
    }




}
