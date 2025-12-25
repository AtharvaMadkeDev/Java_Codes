package StudentManagementSystem;
import java.util.ArrayList;
import java.util.Scanner;

public class Student_Management_System {

	
		
		static ArrayList<Student> students = new ArrayList<Student>();
	    static Scanner sc = new Scanner(System.in);

	    public static void main(String[] args) {

	        while (true) {
	        	System.out.println();
	            System.out.println("--- Student Management System ---");
	            System.out.println("1. Add Student");
	            System.out.println("2. View Students");
	            System.out.println("3. Search Student");
	            System.out.println("4. Delete Student");
	            System.out.println("5. Exit");
	            System.out.print("Enter choice: ");

	            int choice = sc.nextInt();
	            switch (choice) {
	                case 1:
	                    addStudent();
	                    break;
	                case 2:
	                    viewStudents();
	                    break;
	                case 3:
	                    searchStudent();
	                    break;
	                case 4:
	                    deleteStudent();
	                    break;
	                case 5:
	                    System.out.println("Exiting...");
	                    return;
	                default:
	                    System.out.println("Invalid choice!");
	                    
	            }
	        }
	    }

	    public static void addStudent() {
	        System.out.print("Enter Roll No: ");
	        int roll = sc.nextInt();
	        sc.nextLine();

	        System.out.print("Enter Name: ");
	        String name = sc.nextLine();

	        System.out.print("Enter Marks: ");
	        double marks = sc.nextDouble();

	        students.add(new Student(roll, name, marks));
	        System.out.println("Student Added Successfully!");
	    }

	    public static void viewStudents() {
	        if (students.isEmpty()) {
	            System.out.println("No Records Found!");
	            return;
	        }

	        System.out.println("--- Student List ---");
	        for (Student s : students) {
	            System.out.println(s);
	        }
	    }

	    public static void searchStudent() {
	        System.out.print("Enter Roll No to Search: ");
	        int roll = sc.nextInt();

	        for (Student s : students) {
	            if (s.getRollNo() == roll) {
	                System.out.println("Student Found: " + s);
	                return;
	            }
	        }
	        System.out.println("Student Not Found!");
	    }

	    public static void deleteStudent() {
	        System.out.print("Enter Roll No to Delete: ");
	        int roll = sc.nextInt();

	        for (Student s : students) {
	            if (s.getRollNo() == roll) {
	                students.remove(s);
	                System.out.println("Student Deleted Successfully!");
	                return;
	            }
	        }
	        System.out.println("Student Not Found!");
	    }
	


	}


