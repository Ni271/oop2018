package week1;

public class Student {

    // TODO: khai báo các thuộc tính cho Student
    private String name, id, group, email;
    // TODO: khai báo các phương thức getter, setter cho Student
    public String getName(){
        return name;
    }
    public String getId(){
        return id;
    }
    public String getGroup(){
        return group;
    }
    public String getEmail(){
        return email;
    }

    public void setName(String n){
        this.name = n;
    }
    public void setId(String id){
        this.id = id;
    }
    public void setGroup(String gr){
        this.group = gr;
    }
    public void setEmail(String e){
        this.email = e;
    }
    /**
     * Constructor 1
     */

    Student() {
        // TODO: Khởi tạo không có tham só một sinh viên
        name = "Student";
        id = "000";
        group = "INT22041";
        email = "uet@vnu.edu.vn";
    }

    /**
     * Constructor 2
     * @param n
     * @param sid
     * @param em
     */
    Student(String n, String sid, String em) {
        // TODO: Khởi tạo có tham số mọt sinh viên với các thuộc tính name, id, email là các giá trị từ tham số
        this.name = n;
        this.id = sid;
        this.group = "INT22041";
        this.email = em;
    }

    /**
     * Constructor 3
     * @param s
     */
    Student(Student s) {
        // TODO: Khởi tạo sao chép (tạo ra một sinh viên có thuộc tính giống sinh viên s)
        this.name = s.name;
        this.id = s.id;
        this.group = s.group;
        this.email = s.email;
    }

    String getInfo() {
        // TODO: In ra màn hình tên, mã số sinh viên, lớp, email của sinh viên
        System.out.println(name);
        System.out.println(id);
        System.out.println(group);
        System.out.println(email);
        return null; // xóa dòng này sau khi cài đặt
    }
}
