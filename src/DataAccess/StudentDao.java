package DataAccess;

import java.util.List;

/**
 * DataAccess
 * Leo
 * 2018/10/14
 */
public interface StudentDao {
    public List<Student> getAllStudents();
    public Student getStudent(int rollNo);
    public void updateStudent(Student student);
    public void deleteStudent(Student student);
}
