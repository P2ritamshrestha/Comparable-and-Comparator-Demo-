import java.util.Comparator;

public class AgeComparator implements Comparator<Student1> {

    @Override
    public int compare(Student1 std1, Student1 std2) {
        if(std1 == std2)
            return 1;
        else if (std1.age < std2.age)
            return -1;
        else
            return 0;

    }
}
