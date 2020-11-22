package java高级应用编程;

public class Student {
    private String name;
    private int age;
    private Sex sex;

    public Student(String name){
        super();
        this.name = name;
    }
    public Student(){
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student [name="+name+",age"+age+"]";
    }

    public static enum Sex{
        男,女
    };
}
