package com.demo.gdg.domain.chatroom.repository;

import com.demo.gdg.domain.chatroom.model.Chatroom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatroomRepository extends JpaRepository<Chatroom, Long> {
}
