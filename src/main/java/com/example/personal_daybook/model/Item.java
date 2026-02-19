package com.example.personal_daybook.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@Entity
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private String status; // TODO, DONE itp.
    private LocalDateTime deadline;

    @ManyToOne
    @JoinColumn(name = "tab_id")
    private Tab tab;
}
