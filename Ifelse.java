public class Ifelse {
    public char grade;

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public char getGrade() {
        return grade;
    }

    void checkGrade() {
        if (grade == 'A') {
            System.out.println("Wonderful. Keep it up");
        } else {
            System.out.println("Do better next time.");
        }
    }

    public static void main(String[] args) {
        Ifelse student = new Ifelse();
        student.setGrade('B');
        student.checkGrade();
    }
}
