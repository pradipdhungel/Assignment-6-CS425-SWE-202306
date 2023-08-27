package model;

import java.time.LocalDate;
//3.1.	Assume you have been tasked to build an application to be used in managing the Student records
// for a University and an excerpt of the students' data is given as follows:
//
//s1: studentId:110001, name:Dave, dateOfAdmission:11/18/1951
//s2: studentId:110002, name:Anna, dateOfAdmission:12/07/1990
//s3: studentId:110003, name:Erica, dateOfAdmission:01/31/1974
//s4: studentId:110004, name:Carlos, dateOfAdmission:08/22/2009
//s5: studentId:110005, name:Bob, dateOfAdmission:03/05/1990
//
//... etc.
//
//To accomplish this, you are required to code a class named Student, which has the following data fields
// (i.e. instance variables) - studentId, name, dateOfAdmission.
//
//Create a Command-Line Java Application and write code for the Student class, including the following:
//- Each of the data fields,
//- Any 3 constructors including the default constructor, and
//- Getter (accessor) and Setter (mutator) methods for the data fields.
//- Make the class be inside a package named, edu.mum.cs.cs425.demos.studentrecordsmgmtapp.model.

public class Student {
   private int studentId;
    private String name;
    private LocalDate dateOfAdmission;

    // 1st constructors
    public Student(){

    }
    // constructor with all parameter


    public Student(int studentId, String name, LocalDate dateOfAdmission) {
        this.studentId = studentId;
        this.name = name;
        this.dateOfAdmission = dateOfAdmission;
    }
    // constructor with 2 parliaments

    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    // getter and setter


    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfAdmission() {
        return dateOfAdmission;
    }

    public void setDateOfAdmission(LocalDate dateOfAdmission) {
        this.dateOfAdmission = dateOfAdmission;
    }

    @Override
    public String toString(){
        return "Student(" +
                "studentId="+studentId+",name='"+name+'\''+",dataOfAdmission:"+dateOfAdmission+'}';
    }
}
