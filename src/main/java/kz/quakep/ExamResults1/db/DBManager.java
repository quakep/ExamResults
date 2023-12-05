package kz.quakep.ExamResults1.db;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;


public class DBManager {
    @Getter
    @Setter
    static ArrayList<Student> students = new ArrayList<>();
    public static void addStudent(Student student){
        students.add(student);
    }
}