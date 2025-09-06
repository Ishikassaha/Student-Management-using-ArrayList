import java.util.ArrayList; 
import java.util.Scanner; 
class Student { 
int id; 
String name; 
String course; 
Student(int id, String name, String course) { 
this.id = id; 
this.name = name; 
this.course = course; 
} 
@Override 
public String toString() { 
return "ID: " + id + " | Name: " + name + " | Course: " + course; 
} 
} 
public class StudentManagement1 { 
public static void main(String[] args) { 
ArrayList<Student> students = new ArrayList<>(); 
        Scanner sc = new Scanner(System.in); 
        int choice; 
 
        do { 
            System.out.println("\n--- Student Management System ---"); 
            System.out.println("1. Add Student"); 
            System.out.println("2. View Students"); 
            System.out.println("3. Search Student by ID"); 
            System.out.println("4. Delete Student by ID"); 
            System.out.println("5. Exit"); 
            System.out.print("Enter choice: "); 
            choice = sc.nextInt(); 
 
            switch (choice) { 
                case 1: // Add 
                    System.out.print("Enter ID: "); 
                    int id = sc.nextInt(); 
                    sc.nextLine(); // consume newline 
                    System.out.print("Enter Name: "); 
                    String name = sc.nextLine(); 
                    System.out.print("Enter Course: "); 
                    String course = sc.nextLine(); 
                    students.add(new Student(id, name, course)); 
                    System.out.println("   Student Added!"); 
                    break; 
 
                case 2: // View 
                    System.out.println("\n--- Student List ---"); 
                    if (students.isEmpty()) { 
                        System.out.println("No students available."); 
                    } else { 
                        for (Student s : students) { 
                            System.out.println(s); 
                        } 
                    } 
                    break; 
 
                case 3: // Search 
                    System.out.print("Enter ID to search: "); 
                    int searchId = sc.nextInt(); 
                    boolean found = false; 
                    for (Student s : students) { 
                        if (s.id == searchId) { 
                            System.out.println("Found: " + s); 
                            found = true; 
                            break; 
                        } 
                    } 
                    if (!found) System.out.println("  Student not found."); 
                    break; 
 
                case 4: // Delete 
                    System.out.print("Enter ID to delete: "); 
                    int delId = sc.nextInt(); 
                    Student toRemove = null; 
                    for (Student s : students) { 
                        if (s.id == delId) { 
                            toRemove = s; 
                            break; 
                        } 
                    } 
                    if (toRemove != null) { 
                        students.remove(toRemove); 
                        System.out.println("   Student Deleted!"); 
                    } else { 
                        System.out.println("  Student not found."); 
                    } 
                    break; 
 
                case 5: // Exit 
                    System.out.println("Exiting...          "); 
                    break; 
 
                default: 
                    System.out.println("    Invalid choice. Try again."); 
            } 
        } while (choice != 5); 
 
        sc.close(); 
    } 
} 
 
