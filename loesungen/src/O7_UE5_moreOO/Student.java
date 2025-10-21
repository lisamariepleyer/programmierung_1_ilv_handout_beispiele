package O7_UE5_moreOO;

public class Student {
    private String name;
    private int number;
    private double[] grades;
    private static int count;

    public Student(String name, int number) {
        this.name = name;
        this.number = number;
        this.grades = new double[3];

        count++;
    }

    public double calculateAverage(){
        double sum = 0;
        int gradeCount = 0;

        for (double g : grades){
            sum += g;
        }

        return sum/grades.length;
    }

    public int compareStudentGrades(Student anotherStudent){
        // if (this.calculateAverage() > anotherStudent.calculateAverage()) {
        //     return 1;
        // } else if (this.calculateAverage() < anotherStudent.calculateAverage()) {
        //     return -1;
        // } else {
        //     return 0;
        // }

        // negation makes sure 1 is better than 5 and not vice versa
        return Double.compare(this.calculateAverage(), anotherStudent.calculateAverage()) * -1;
    }

    public static void printStudentCount(){
        System.out.println(count + " students were created.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double[] getGrades() {
        return grades;
    }

    public void setGrades(double[] grades) {
        this.grades = grades;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Student.count = count;
    }
}
