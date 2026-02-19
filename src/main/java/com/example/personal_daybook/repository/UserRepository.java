package com.example.personal_daybook.repository;

import com.example.personal_daybook.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
