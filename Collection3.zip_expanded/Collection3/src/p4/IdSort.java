package p4;

import java.util.Comparator;

public class IdSort implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		// TODO Auto-generated method stub
		if(s1.getId()<s2.getId())
			return -1;
		else
			return 1;
	}

}
