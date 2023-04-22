package own.cfb.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import own.cfb.boot.domain.Response;
import own.cfb.boot.model.Student;
import own.cfb.boot.service.StudentService;

import java.util.List;

@RestController
@RequestMapping("/stu")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/getStudentList")
    public Response<List<Student>> getStudentList(){
        Response<List<Student>> response=new Response<List<Student>>();
        List<Student> studentList = studentService.getStudentList();
        response.setCode(0);
        response.setResult(studentList);
        return response;
    }
}
