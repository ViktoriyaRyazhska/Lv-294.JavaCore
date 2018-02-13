package third.exercise;

import java.util.Comparator;

public class CourseComparator implements Comparator<Student> {

	@Override
	public int compare(Student t1, Student t2) {
		return t1.getCourse() - t2.getCourse();
	}

}
