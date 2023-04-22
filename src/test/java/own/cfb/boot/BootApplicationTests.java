package own.cfb.boot;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import own.cfb.boot.dao.StudentDao;
import own.cfb.boot.dao.TeacherDao;
import own.cfb.boot.model.Student;
import own.cfb.boot.model.Teacher;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
class BootApplicationTests {

    @Autowired
    private StudentDao studentDao;
    @Autowired
    private TeacherDao teacherDao;
    @Test
    public void test() {
        this.getStudentList();
        this.getStudentAll();
        this.getTeacherList();
    }
    public void getStudentList() {
        List<Student> studentList = studentDao.getStudentList();
        System.out.println("getStudentList:"+studentList.toString().toString());
    }
    public void getStudentAll() {
        List<Student> studentList = studentDao.getStudentAll();
        System.out.println("getStudentAll:"+studentList.toString().toString());
    }
    public void getTeacherList(){
        List<Teacher> teacherList = teacherDao.getTeacherList();
        System.out.println("getTeacherList:"+teacherList.toString().toString());
    }
}
