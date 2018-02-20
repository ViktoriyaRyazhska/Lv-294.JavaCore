import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Task3 {
    private static void printStudents(List<Student> students) {
        for (Student student : students) {
            System.out.println(student.getName());
        }
    }
    
    private static void printStudents(List<Student> students, Integer course) {
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }

    private static void sortStudentsByName(List<Student> students) {
        students.sort(new Comparator<Student>() {

            @Override
            public int compare(Student a, Student b) {
                return a.getName().compareTo(b.getName());
            }
        });
    }

    private static void sortStudentsByCourse(List<Student> students) {
        students.sort(new Comparator<Student>() {

            @Override
            public int compare(Student a, Student b) {
                return a.getCourse().compareTo(b.getCourse());
            }
        });
    }

    public static void main(String[] arg) {
        List<Student> students = new ArrayList<Student>();
        
        students.add(new Student("Vasyl", 1));
        students.add(new Student("Omelyan", 1));
        students.add(new Student("Haryton", 1));
        students.add(new Student("Nazar", 2));
        students.add(new Student("Alfred", 2));
        students.add(new Student("Havriysha", 2));
        students.add(new Student("Stepan", 3));
        students.add(new Student("Shloma", 3));
        students.add(new Student("Haradiy", 3));
        students.add(new Student("Orest", 3));
        
        System.out.println("\nStudetns of Course 2:");
        printStudents(students, 2);
        
        System.out.println("\nSorted by Course:");
        sortStudentsByCourse(students);
        printStudents(students);
        
        System.out.println("\nSorted by Name:");
        sortStudentsByName(students);
        printStudents(students);
    }
}
