package com.mycompany.jerseymvcexam;

import lombok.Data;

@Data
public class BoardBean {
    private String name;
    private String comment;
    private Message[] articles;
}
