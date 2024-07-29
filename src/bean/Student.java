package bean;

public class Student {
    private String name;
    private String surname;
    private String className;
    private int studentAge;

    public Student(){

    }
    public Student(String name,String surname,String className,int studentAge){
        this.name = name;
        this.surname = surname;
        this.className = className;
        this.studentAge = studentAge;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public String getFullInfo(){
        return this.getName() + " " +  this.getSurname() + " " + this.getClassName() + " "+ this.getStudentAge();
    }
}
