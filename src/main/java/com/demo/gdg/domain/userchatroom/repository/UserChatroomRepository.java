package com.demo.gdg.domain.userchatroom.repository;

import com.demo.gdg.domain.userchatroom.model.UserChatroom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserChatroomRepository extends JpaRepository<UserChatroom, Long> {
}
