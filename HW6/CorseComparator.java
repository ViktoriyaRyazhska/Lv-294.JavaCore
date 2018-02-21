package HW6;

import java.util.Comparator;

public class CorseComparator implements Comparator<Student>{
    @Override
    public int compare (Student o1, Student o2) {
        return o1.corse - o2.corse ;
    }
}
