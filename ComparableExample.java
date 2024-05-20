import java.util.ArrayList;
import java.lang.*;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {
    int rollno;
    String name;
    int age;

    public int getRollno(){ return rollno;}
    public String getName(){return name;}
    public int getAge(){return age;}

    public Student (int rollno, String name, int age){
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }

    public int compareTo(Student st){
        return this.rollno - st.rollno;
    }
    public String toString(){
        return "Rollno: "+ rollno+ " Name: "+ name+ " Age: "+age;
    }

    public static void main(String args[]){

        List<Student> std = new ArrayList<>();
        std.add(new Student(100, "RAM", 22));
        std.add(new Student(102,"Abi",15));
        std.add(new Student(99, "Yub",25));


        System.out.println(std);
        Collections.sort(std);
        System.out.println(std);
    }

}