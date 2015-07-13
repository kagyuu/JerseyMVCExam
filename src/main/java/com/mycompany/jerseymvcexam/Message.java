package com.mycompany.jerseymvcexam;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Message {
    private Date date;
    private String name;
    private String comment;
}
