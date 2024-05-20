import java.util.Comparator;

class  NameCompare implements Comparator<Student1> {
    public int compare(Student1 m1, Student1 m2)
    {
        return m1.getName().compareTo(m2.getName());
    }
}

class  NameCompare1 implements Comparator<Student1> {
    public int compare(Student1 m1, Student1 m2)
    {
        return m1.getName().compareTo(m2.getName());
    }
}
