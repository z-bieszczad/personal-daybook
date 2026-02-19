package com.example.personal_daybook.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Tab {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
