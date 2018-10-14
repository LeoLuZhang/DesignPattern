package TransferObject;

import java.util.ArrayList;
import java.util.List;

/**
 * TransferObject
 * Leo
 * 2018/10/14
 */
public class StudentBO {
    List<StudentVO> students;

    public StudentBO(){
        StudentVO student1 = new StudentVO("Robert",0);
        StudentVO student2 = new StudentVO("John",1);
        students.add(student1);
        students.add(student2);
    }

    public void deleteStudent(StudentVO student) {
        students.remove(student.getRollNo());
        System.out.println("Student: Roll No "
                + student.getRollNo() +", deleted from database");
    }

    public List<StudentVO> getAllStudents() {
        return students;
    }

    public StudentVO getStudent(int rollNo) {
        return students.get(rollNo);
    }

    public void updateStudent(StudentVO student) {
        students.get(student.getRollNo()).setName(student.getName());
        System.out.println("Student: Roll No "
                + student.getRollNo() +", updated in the database");
    }
}
