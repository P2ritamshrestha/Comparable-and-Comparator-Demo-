import java.util.Comparator;

class DivisionCompatator implements Comparator<Student1> {
    public int compare(Student1 st1 , Student1 st2){
        return st1.getDivision().compareTo(st2.getDivision());
    }

}
