package com.demo.gdg.domain.chatroom.model;

import com.demo.gdg.domain.userchatroom.model.UserChatroom;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity(name = "chatrooms")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Chatroom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long name;

    @OneToMany(mappedBy = "chatroom", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @Builder.Default
    private List<UserChatroom> userChatroomList = new ArrayList<>();

}
