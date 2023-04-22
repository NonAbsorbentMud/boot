package own.cfb.boot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import own.cfb.boot.dao.StudentDao;
import own.cfb.boot.model.Student;
import own.cfb.boot.service.StudentService;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Override
    public List<Student> getStudentList() {
        return studentDao.getStudentList();
    }
}
