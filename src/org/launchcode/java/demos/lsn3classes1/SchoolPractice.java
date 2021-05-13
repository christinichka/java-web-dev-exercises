package org.launchcode.java.demos.lsn3classes1;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class SchoolPractice {
    public static void main(String[] args) {
        // 2. Instantiate the Student class using yourself as the student. For the numberOfCredits give yourself 1 for this class and a GPA of 4.0 because you are a Java superstar!
        Student student1 = new Student();
        student1.setName("Christina");
        student1.setNumberOfCredits(1);
        student1.setGpa(4.0);
    }
    // 3. In the school package, create a class Course with at least three fields.
    public class Course {
        private String topic;
        private Teacher instructor;
        private ArrayList<Student> enrolledStudents;
    }
    // 4. In the school package, create a class Teacher with four fields: firstName, lastName, subject, and yearsTeaching.
    public class Teacher {
        private String firstName;
        private String lastName;
        private String subject;
        private Integer yearsTeaching;
    }

}










