package studentobj;

public class StudentObj {
    private String rollno;
    private String name;
    private String age;

    public StudentObj() {
    }

    public StudentObj(String  rollno, String name, String age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }

    public String getRollno() {
        return rollno;
    }

    public String setRollno(String rollno) {
        this.rollno = rollno;
        return rollno;
    }

    public String getName() {
        return name;
    }

    public String setName(String name) {
        this.name = name;
        return name;
    }

    public String  getAge() {
        return age;
    }

    public String setAge(String age) {
        this.age = age;
        return age;
    }
}
