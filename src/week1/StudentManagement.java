package week1;

import javax.xml.bind.SchemaOutputResolver;

public class StudentManagement {

    // TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp Student (max. 100)
    Student[] students = new Student[100];

    public boolean sameGroup(Student s1, Student s2) {
        // TODO: Kiểm tra xem hai sinh viên s1 và s2 có cùng lớp hay không
        return (s1.getGroup().equals(s2.getGroup()));
    }

    void studentsByGroup() {
        // TODO: In ra danh sách sinh viên theo từng lớp

    }

    void removeStudent(String id) {
        // TODO: Xóa sinh viên với mã số sinh viên là id ra khỏi danh sách

    }

    public static void main(String[] args) {
        // TODO: Tạo ra một sinh viên với thông tin của bản thân
    Student Ly = new Student();
    Ly.setName("Ly");
    Ly.setId("17020873");
    Ly.setGroup("INT220241");
    Ly.setEmail("17020873@vnu.edu.vn");

        // TODO: In ra màn hình tên và thông tin của sinh viên vừa tạo
    System.out.println(Ly.getName());
    Ly.getInfo();

        // TODO: Tạo ba sinh viên với hai sinh vên thuộc lớp "INT2241", một sinh viên thuộc lớp "INT2242", và in ra màn hình thông tin từng sinh viên
    Student s1 = new Student();
    s1.getInfo();

    Student s2 = new Student("Khanh", "17020673", "17020673@vnu.edu.vn");
    s2.getInfo();

    Student s3 = new Student(s1);
    s3.setGroup("INT22042");
    s3.getInfo();

    // TODO: Kiểm tra phương thức sameGroup ở trên
    StudentManagement management = new StudentManagement();

    System.out.println("Sinh viên s1 và s2 cùng lớp: " + management.sameGroup(s1, s2));
    System.out.println("Sinh viên s1 va s3 cùng lớp: " + management.sameGroup(s1, s3));
    System.out.println("Sinh viên s2 và s3 cùng lớp: " + management.sameGroup(s2, s3));

    }
}


