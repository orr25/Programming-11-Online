/*===================================
 * Unit 4 Assignment Computer Programming 11
 * Andrew Orr 2023 January 2
 *
 * This is the main class.
 * Create one school add some teachers add some students
 * delete some teachers
 * delete some students
 * print out the lists.
 *
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Creating a new School now!  Woohoo. ");

        // create a new school
        School myschool = new School("School of System Database", 22, "Oslo");

        // create some teachers, and add to the school
        Teacher marco = new Teacher("Marco", "Chin", "Math");
        myschool.addTeacher(marco);
        Teacher chi = new Teacher("Chi", "yan", "Chemistry");
        myschool.addTeacher(chi);
        Teacher levi = new Teacher("Levi", "Ackerman", "PE");
        myschool.addTeacher(levi);

        //create some students, and add to the school
        Student elmo = new Student("Elmo", "Lee", 75, 2345);
        myschool.addStudent(elmo);
        Student hans = new Student("Hans", "Zimm", 82, 1145);
        myschool.addStudent(hans);
        Student eren = new Student("Eren", "yeager", 85, 1232);
        myschool.addStudent(eren);
        Student armin = new Student("Armin", "hote", 97, 2343);
        myschool.addStudent(armin);
        Student floch = new Student("Floch", "man", 78, 2923);
        myschool.addStudent(floch);
        Student erwin = new Student("Erwin", "braus", 76, 2189);
        myschool.addStudent(erwin);
        Student sasha = new Student("Sasha", "chan", 80, 2178);
        myschool.addStudent(sasha);
        Student christa = new Student("Christa", "Historia", 86, 2232);
        myschool.addStudent(christa);
        Student gabi = new Student("Gabi", "jiang", 89, 2253);
        myschool.addStudent(gabi);
        Student david = new Student("David", "Lee", 92, 2254);
        myschool.addStudent(david);

        // Display both lists
        myschool.showStudents();
        myschool.showTeachers();

        // Delete some students, and delete one teacher
        System.out.println("");
        System.out.println("Making changes to the lists!");
        myschool.deleteTeacher(marco);
        myschool.deleteStudent(elmo);

        // Display both lists
        myschool.showStudents();
        myschool.showTeachers();
    }
}
