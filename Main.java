import java.util.ArrayList;
import java.util.Scanner;

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("ID: " + id + " Name: " + name);
    }
}

public class Main {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1.Add Student");
            System.out.println("2.View Students");
            System.out.println("3.Exit");

            int choice = sc.nextInt();

            switch(choice) {

                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    students.add(new Student(id, name));

                    System.out.println("Student Added!");
                    break;

                case 2:
                    for(Student s : students) {
                        s.display();
                    }
                    break;

                case 3:
                    System.exit(0);
            }
        }
    }
}