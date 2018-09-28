package week2.task3;

public class Teacher {
    // TODO: Khai báo thuộc tính của Teacher
    private String name, course, group;

    // TODO: getter
    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }

    public String getGroup() {
        return group;
    }

    // TODO: setter
    public void setName(String n) {
        name = n;
    }

    public void setCourse(String c) {
        course = c;
    }

    public void setGroup(String gr) {
        group = gr;
    }

    // TODO:
    Teacher(String n, String c, String ngr) {
        name = n;
        course = c;
        group = ngr;
    }
    public void in(Teacher A){
        System.out.println(A.getName());
        System.out.println(A.getCourse());
        System.out.println(A.getGroup());
    }
}
