package com.mycompany.jerseymvcexam;

import com.github.mustachejava.TemplateFunction;
import java.util.List;
import lombok.Data;

@Data
public class MExamBean {
    private String message;
    private String html;
    private boolean flag1;
    private boolean flag2;
    private List<Person> team1;
    private List<Person> team2;
    private TemplateFunction copyrights;
}
