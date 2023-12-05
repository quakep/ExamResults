package kz.quakep.ExamResults1.controllers;

import kz.quakep.ExamResults1.db.DBManager;
import kz.quakep.ExamResults1.db.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
public class HomeController {
    private Long id = 1L;
    @GetMapping(value = "/")
    public String addStudentPage(Model model){
        return "addStudent";
    }
    @PostMapping(value = "/")
    public String addStudentAgainPage(Model model,
                                      @RequestParam(name = "name") String name,
                                      @RequestParam(name = "surname") String surname,
                                      @RequestParam(name = "exam") Integer exam
                                     ){
        Student student = new Student(id, name, surname, exam, null);
        student.setMark(student.getMark(exam));
        this.id++;
        DBManager.addStudent(student);
        System.out.println(student);
        System.out.println(DBManager.getStudents());
        return "addStudent";
    }
    @GetMapping(value = "/list")
    public String listPage(Model model){
        ArrayList<Student> students = DBManager.getStudents();
        model.addAttribute("students", students);
        System.out.println(students);
        return "list";
    }
}