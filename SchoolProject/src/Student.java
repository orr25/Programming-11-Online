/*===================================
 *
 * This is the Student class.
 *
 * Every student has:  last name, first name, grade, and student number.
 * There are methods to:
 * - create a new students
 * - get string for printing
 * - getters and setters
 *
 */
public class Student {
    String lastname;
    String firstname;
    int grade;
    int number;

    // Constructor
    public Student (String fn, String ln, int grade, int num) {
        this.lastname = ln;
        this.firstname = fn;
        this.grade = grade;
        this.number = num;
    }

    // Getter for the lastname field
    public String getLastname() {
        return lastname;
    }

    // Setter for the lastname field
    public void setLastname(String newlastname) {
        this.lastname = newlastname;
    }

    // Getter for the firstname field
    public String getFirstname() {
        return firstname;
    }

    // Setter for the firstname field
    public void setFirstname(String newfirstname) {
        this.firstname = newfirstname;
    }

    // Getter for the grade field
    public int getGrade() {
        return grade;
    }

    // Setter for the grade field
    public void setGrade(int newgrade) {
        this.grade = newgrade;
    }

    // Getter for the student number field
    public int getStudentnum(){
        return number;
    }

    // Setter for the student number field
    public void setStudentnum(int num) {
        this.number = num;
    }

    public String toString() {
        return "Name: " + firstname + " " + lastname + " Grade: " + grade + " Student Number: " + number;
    }
}
