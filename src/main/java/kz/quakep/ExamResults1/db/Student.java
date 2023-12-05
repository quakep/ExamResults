package kz.quakep.ExamResults1.db;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private Long id;
    private String name;
    private String surname;
    private Integer exam;
    private String mark;
    public String getMark(Integer exam){
        if(exam>=90) mark="A";
        else if(exam>=75) mark="B";
        else if(exam>=60) mark="C";
        else if(exam>=50) mark="D";
        else mark="F";
        return mark;
    }
}