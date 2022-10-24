package ie.atu.week5;

import java.util.Scanner;

public class StudentApp {

    public static void main(String[] args) {
        //first instance of student
        System.out.println("Please enter your name");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        Student studApp = new Student();
        studApp.setName(name);
        System.out.println("The name you entered is: " + studApp.getName());

        System.out.println("Please enter your email");
        String email = input.nextLine();
        studApp.setEmail(email);
        System.out.println("The email you entered is: " + studApp.getEmail());

        System.out.println("Please enter your course");
        String course = input.nextLine();
        studApp.setCourse(course);
        System.out.println("The course you entered is: " + studApp.getCourse());

        //second instance of student
        Student studApp2 = new Student();
        System.out.println("Please enter second name");
        String name2 = input.nextLine();
        studApp2.setName(name2);
        System.out.println("The name you entered is: " + studApp2.getName());

        System.out.println("Please enter second email");
        String email2 = input.nextLine();
        studApp2.setEmail(email2);
        System.out.println("The email you entered is: " + studApp2.getEmail());

        System.out.println("Please enter course");
        String course2 = input.nextLine();
        studApp2.setCourse(course2);
        System.out.println("The course you entered is: " + studApp2.getCourse());

    }
}
