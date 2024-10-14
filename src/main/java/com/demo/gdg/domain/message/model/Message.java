package com.demo.gdg.domain.message.model;

import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "messages") // MongoDB의 "messages" 컬렉션과 매핑
@Getter
public class Message {
    @Id
    private Long id;

    private String senderId;

    private String chatroomId;

    private String content;

    private List<Attachment> attachments;

}