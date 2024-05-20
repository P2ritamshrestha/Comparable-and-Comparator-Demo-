import java.util.*;
import java.io.*;

class Student1{
String name;
int age;
boolean result;
Character division;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isResult() {
        return result;
    }

    public Character getDivision() {
        return division;
    }

    public Student1(String name, int age, boolean result, char division){
        this.name = name;
        this.age = age;
        this.result = result;
        this.division = division;
    }

    public String toString(){
        return "Name: "+name+ " Age: "+ age+ " Result : "+result+" Division: "+ division;
    }
    public static void main(String args[]){
        ArrayList<Student1> std1 = new ArrayList<>();
        std1.add(new Student1("Ram",22,true,'B'));
        std1.add(new Student1("Ashish",25,false,'A'));
        std1.add(new Student1("Swornim",15,true,'C'));


        System.out.println(std1);
        System.out.println(" Age Comparator");
        AgeComparator ag = new AgeComparator();
        Collections.sort(std1,ag);
        System.out.println(std1);
        System.out.println("Name Comparator");
        NameCompare1 na = new NameCompare1();
        Collections.sort(std1,na);
        System.out.println(std1);
        System.out.println("Division Comparator");
        DivisionCompatator div = new DivisionCompatator();
        Collections.sort(std1,div);
        System.out.println( std1);
        System.out.println("Result comparator");
        ResultCompare res = new ResultCompare();
        Collections.sort(std1,res);
        System.out.println( std1);
    }

}

