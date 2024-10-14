package com.demo.gdg.domain.message.model;

import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Getter
public class Attachment {
    @Id
    private Long id;

    private String filename;
    private String fileType;
    private String url;

}
