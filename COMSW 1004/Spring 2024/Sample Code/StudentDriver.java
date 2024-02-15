import java.util.Scanner;

public class StudentDriver{

    public static void main(String[] args){

        //declaring and instantiating a Scanner and a Student
        Scanner sc = new Scanner(System.in);
        Student myStudent = new Student("Griffin", 2106, 20);

        //accessors being invoked
        System.out.println(myStudent.getName());
        System.out.println(myStudent.getID());
        System.out.println(myStudent.getAge());

        //accepting user input and using mutator
        System.out.println("Enter an age: ");
        int newAge = sc.nextInt();
        myStudent.setAge(newAge);

        //accessors being invoked
        System.out.println(myStudent.getName());
        System.out.println(myStudent.getID());
        System.out.println(myStudent.getAge());

    }




}