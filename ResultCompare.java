import java.util.Comparator;

class ResultCompare implements Comparator<Student1> {
    @Override
    public int compare(Student1 o1, Student1 o2) {
        boolean result1 = o1.isResult();
        boolean result2 = o2.isResult();

        if (result1 == result2) {
            return 0;
        } else if (result1) {
            return 1;
        } else {
            return -1;
        }
    }
}
