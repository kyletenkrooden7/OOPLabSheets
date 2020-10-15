package labsheet7.exercise1.exercise3;

import java.util.Arrays;

public class TestCollegeApp {
    public static void main(String[] args) {

        Student student1 = new Student(154345, "Jake", "Computing");
        Student student2 = new Student(234532, "Mary", "Creative Media");
        Student student3 = new Student(453726, "Tommy", "Computing");
        Student student4 = new Student(623456, "Peter", "Creative Media");

        Student computingStudents[] = new Student[10];
        computingStudents[0]=student1;
        computingStudents[1]=student3;

        Student creativeMediaStudents[] = new Student[10];
         creativeMediaStudents[0]=student2;
        creativeMediaStudents[1]=student4;

        Department ComputingDepartment = new Department("Computing", computingStudents);
        Department CreativeMediaDepartment = new Department("Creative Media", creativeMediaStudents);

        Department Departments[] = new Department[5];

        Departments[0]=ComputingDepartment;
        Departments[1]=CreativeMediaDepartment;


        Institute institute = new Institute("Institute of Technology, Tralee", Departments);

        System.out.println(institute);

        System.out.println("Total Students in institute:" + institute.getTotalStudents());

        creativeMediaStudents[2] = student1;
        student1.setDepartment("Creative Media");
        computingStudents[0] = null;

        System.out.println(institute);
    }
}