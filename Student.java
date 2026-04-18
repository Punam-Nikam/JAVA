/*example of aggregation - in java aggregation is a special form of association
which has a "has-a" relationship. It represents a relationship where one class 
contains a reference to another class, but the contained class can exist independently of the container class. */
class Subject {
    private String subjectName;

    Subject(String subjectName) {
    this.subjectName = subjectName;
    }


    public String getSubjectName() {
    return subjectName;
    }


    public void setSubjectName(String subjectName) {
    this.subjectName = subjectName;
    }
}

public class Student {
    private int rollNo;
    private String studentName;
    private Subject subject;

        Student(int rollNo, String studentName, Subject subject) {
        this.rollNo = rollNo;
        this.studentName = studentName;
        this.subject = subject;
        }

        public void displayDetails() {
        System.out.println("Student Name: " + studentName);

        System.out.println("Subject Name: " + subject.getSubjectName());
        }

    public static void main(String args[]) {
        
        Subject subject = new Subject("Maths");
        Student student = new Student(101, "punam", subject);
        student.displayDetails();
    }
}
