
// Student class
package Abstract;

public class Student extends Person {
    private int StudentId;

    public Student(String nm, String gen, int id) {
        super(nm, gen);
        this.StudentId = id;
    }

    @Override
    public void Studying() {
        if (StudentId == 0) {
            System.out.println("not studying");
        } else {
            System.out.println("Pursuing a Degree in Bachelor of Engineering");
        }

    }

    public static void main(String[] args) {
        Person student = new Student("Divyen", "Male", 0);
        Person student1 = new Student("Milan", "Male", 30);
        Person student2 = new Student("Mitesh", "Male", 12);
        Person student3 = new Student("Nirali", "Female", 1);
        student.Studying();
        student1.Studying();
        student2.Studying();
        student3.Studying();
        System.out.println(student.toString());
        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(student3.toString());
    }
}

/*
 javac -d . .\Student.java
 java Abstract.Student



not studying
Pursuing a Degree in Bachelor of Engineering
Pursuing a Degree in Bachelor of Engineering
Pursuing a Degree in Bachelor of Engineering
Name = Divyen :: Gender = Male
Name = Milan :: Gender = Male
Name = Mitesh :: Gender = Male
Name = Nirali :: Gender = Female
 */