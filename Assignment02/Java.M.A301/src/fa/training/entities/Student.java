package fa.training.entities;

public class Student extends Person {
    private String studentId;
    private double theory;
    private double practice;

    public double calculateFinalMark() {
        double mark = (theory + practice) / 2;
        return mark;
    }
    public Student(){

    }
    public Student( String studentId, double theory, double practice) {

        this.studentId = studentId;
        this.theory = theory;
        this.practice = practice;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public Student(String fullName, String gender, String phone, String email, String studentId, double theory, double practice) {
        super(fullName, gender, phone, email);
        this.studentId = studentId;
        this.theory = theory;
        this.practice = practice;
    }

    public double getTheory() {
        return theory;
    }

    public void setTheory(double theory) {
        this.theory = theory;
    }

    public double getPractice() {
        return practice;
    }

    public void setPractice(double practice) {
        this.practice = practice;
    }
}

