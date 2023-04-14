package net.ravi.springtest.serivce;


import net.ravi.springtest.dao.StudentDao;
import net.ravi.springtest.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentDao studentDao;

    public List<Student> getStudents(){

        return  studentDao.getStudentList();
    }

    public void create(Student student){
        studentDao.create(student);
    }

    public void update(Student student) {
        studentDao.update(student);
    }

    public void delete(int id) {
        studentDao.delete(id);
    }

    public Student getById(int id) {
        return studentDao.getById(id);
    }
}
