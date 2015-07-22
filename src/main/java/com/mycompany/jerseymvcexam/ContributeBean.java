package com.mycompany.jerseymvcexam;

import javax.validation.constraints.Size;
import javax.ws.rs.FormParam;
import lombok.Data;

@Data
public class ContributeBean {
    
    @FormParam("name")
    @Size(min = 1, max = 255)
    private String name;
    
    @FormParam("comment")
    @Size(min = 1, max = 255)
    private String comment;
}
