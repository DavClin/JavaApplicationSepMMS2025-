package aggregation;

import composition.Payment;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

public class SchoolManagementSystemApp {

    public static void main(String[] args) {

        // Students objects created
        Student s1 = new Student(101, "Henry", "John", 'm');
        Student s2 = new Student(102, "Joy", "Jack", 'f');
        Student s3 = new Student(103, "Franklin", "Williams", 'm');
        Student s4 = new Student(104, "Toby", "Emmanuel", 'm');
        Student s5 = new Student(105, "Lucy", "Andy", 'f');
        Student s6 = new Student(109, "David", "Andy", 'm');
        Student s7 = new Student(185, "Lucy", "Clinton", 'f');
        Student s8 = new Student(156, "Clin", "Dav", 'm');

        ArrayList<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        students.add(s6);
        students.add(s7);
        students.add(s8);
       
        
        
        //Students who have made payment
        
        s1.makePayment(300000.00, LocalDate.of(2026, 8, 10), "Transfers", "Paid for Data Analytics");
        s3.makePayment(350000.00, LocalDate.of(2026, 8, 8), "POS", "Paid for Java");
        s5.makePayment(50000.00, LocalDate.of(2026, 8, 11), "Transfers", "Paid for MMS");
        s8.makePayment(500000.00, LocalDate.of(2025, 8, 21), "Transfers", "Paid  to buy Niit");
        // School object created
        School school = new School("Green Land International", students);
        school.displayStudentDetails();

    }

}