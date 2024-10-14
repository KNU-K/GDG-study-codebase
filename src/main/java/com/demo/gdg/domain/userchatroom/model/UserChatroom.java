package com.demo.gdg.domain.userchatroom.model;

import com.demo.gdg.domain.chatroom.model.Chatroom;
import com.demo.gdg.domain.user.model.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name="user_chatroom")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class UserChatroom {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

   @ManyToOne
   @JoinColumn(name = "user_id")
   private User participant;

   @ManyToOne
   @JoinColumn(name = "chatroom_id")
   private Chatroom chatroom;
}
