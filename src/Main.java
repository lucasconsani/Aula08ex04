import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student;

        student = new Student();

        System.out.print("Write the student name: ");
        student.name = sc.next();
        System.out.print("Write the 1rst tri note: ");
        student.firstTri = sc.nextDouble();
        System.out.print("Write the 2nd tri note: ");
        student.secondTri = sc.nextDouble();
        System.out.print("Write the 3rd tri note: ");
        student.thirdTri = sc.nextDouble();

        System.out.println(student);

        sc.close();
    }
}