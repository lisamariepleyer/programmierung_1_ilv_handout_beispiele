package O7_UE5_moreOO;

public class Main {
    public static void main(String[] args) {
        Student.printStudentCount();

        Student s1 = new Student("Emily", 1);
        s1.setGrades(new double[]{1, 1, 1});
        System.out.println(s1.calculateAverage());

        Student s2 = new Student("James", 2);
        s2.setGrades(new double[]{1, 2, 3});
        System.out.println(s2.calculateAverage());

        Student s3 = new Student("Olivia", 2);
        s3.setGrades(new double[]{3, 4, 5});
        System.out.println(s3.calculateAverage());

        Student s4 = new Student("Ben", 2);
        s4.setGrades(new double[]{3, 4, 5});
        System.out.println(s4.calculateAverage());

        Student.printStudentCount();

        System.out.println(s1.compareStudentGrades(s2));
        System.out.println(s2.compareStudentGrades(s1));
        System.out.println(s3.compareStudentGrades(s4));
    }
}
