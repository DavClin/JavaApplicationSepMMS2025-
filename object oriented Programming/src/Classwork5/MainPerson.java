package Classwork5;

public class MainPerson {

    public static void main(String[] args) {

        System.out.println("For Student: \n");
        Student student = new Student("Princess", 15);
        student.displayDetails();
        student.performDuty();

        System.out.println("==========================\n");
        System.out.println("For Teacher: \n");
        Teacher teacher = new Teacher("Lily", 20); 
        teacher.displayDetails();
        teacher.performDuty();

    }

}

//An exception is an unexpected event that occurs 
// during the execution of a program and interrupts 
//the normal flow of the program.
//Exception handling is the mechanism used to detect, handle,
//and recover from exceptions so that the program 
//does not terminate unexpectedl

//Handling an exception means writing code that 
//prevents the program from crashing when an error occurs.

//An exception is an abnormal or unexpected event that occurs 
// during program execution and disrupts the normal flow of the program.


//Exception handling is the mechanism used to handle 
//exceptions so that the program does not terminate unexpectedly.

//We use exception handling to prevent the program from crashing 
//and to allow it to respond appropriately when an error occurs.




