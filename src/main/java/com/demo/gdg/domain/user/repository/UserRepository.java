package com.demo.gdg.domain.user.repository;

import com.demo.gdg.domain.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
