package student;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student("Alice", "S12345");
        student.addGrade(85);
        student.addGrade(90);
        student.addGrade(97);
        student.addGrade(78);
        System.out.println(student);
        System.out.println("Average Grade: " + student.getAverageGrade());
    }
}
