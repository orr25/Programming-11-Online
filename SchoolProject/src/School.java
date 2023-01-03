/*===================================
 *
 * This is the school class.
 *
 * Every school has:  list of teachers, list of courses, list of students, a name, a location, a capacity
 * There are methods to:
 * - create a new school
 * - get string for printing
 * - getters and setters
 *
 */
import java.util.ArrayList;

public class School {
    ArrayList<Teacher> teachers = new ArrayList<>();
    ArrayList<Student> students = new ArrayList<>();
    ArrayList<Course> courses = new ArrayList<>();
    private String name;
    private int capacity;
    private String location;

    // Constructor for making a new school
    public School(String name, int capacity, String location) {
        this.name = name;
        this.capacity = capacity;
        this.location = location;
    }

    // Getter for the name field
    public String getName() {
        return name;
    }

    // Setter for the name field
    public void setName(String newName) {
        this.name = newName;
    }

    // Getter for the capacity field
    public int getCapacity() {
        return capacity;
    }

    // Setter for the capacity field
    public void setCapacity(int newcapacity) {
        this.capacity = newcapacity;
    }

    // Getter for the location field
    public String getlocation() {
        return location;
    }

    // Setter for the location field
    public void setlocation(String newlocation) {
        this.location = newlocation;
    }

    // Create a new teacher object, and add it to the teachers Array List
    public void addTeacher(Teacher t) {
        teachers.add(t);
    }

    // Delete a teacher object from the teachers Array List
    public void deleteTeacher(Teacher t) {
        teachers.remove(t);
    }

    // Show all teachers, print them all
    public void showTeachers() {
        System.out.println("");
        System.out.println("Teacher list is: ");
        for (Teacher t : teachers) {
            System.out.println(t.toString());
        }
    }

    // Create a new student object, and add it to the students Array List
    public void addStudent(Student s) {
        students.add(s);
    }

    // Delete a students object from the students Array List
    public void deleteStudent(Student s) {
        students.remove(s);
    }

    // Show all students, print them all
    public void showStudents() {
        System.out.println("");
        System.out.println("Student list is: ");
        for (Student s : students) {
            System.out.println(s.toString());
        }
    }
}
