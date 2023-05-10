/**
 * - 학생(Student) 클래스를 작성해보세요. 학생 클래스는 이름(name), 학번(studentID), 전공(major) 멤버 변수를 가지며, 생성자와 정보를 출력하는 메서드를 작성하세요.
 * - 학생 객체를 생성하고, 정보를 출력해보세요.
 */
public class Student {
    String name;
    int studentID;
    String major;

    public Student(String name, int studentID, String major) {
        this.name = name;
        this.studentID = studentID;
        this.major = major;
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Student ID: " + studentID);
        System.out.println("Major: " + major);
    }
}

class StudentMain {
    public static void main(String[] args) {
        Student student = new Student("오지수", 202305, "컴퓨터과학전공");
        student.printInfo();
    }
}