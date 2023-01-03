/*===================================
 *
 * This is the Teacher class.
 *
 * Every teacher has:  last name, first name, subject
 * There are methods to:
 * - create a new teachers
 * - get string for printing
 * - getters and setters
 *
 */
public class Teacher {
    String firstname;
    String lastname;
    String subject;
    // Constructor
    public Teacher (String fn, String ln, String sb) {
        this.firstname = fn;
        this.lastname = ln;
        this.subject = sb;
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
    // Getter for the subject field
    public String getsubject() {
        return subject;
    }

    // Setter for the subject field
    public void setsubject(String newsubject) {
        this.subject = newsubject;
    }
    public String toString() {
        return "Name: " + firstname + " " + lastname + " subject: " + subject;
    }
}
