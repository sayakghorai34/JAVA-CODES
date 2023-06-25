package p4;

import java.util.Comparator;

public class AgeComp implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		if(s1.getAge()<s2.getAge())
			return 1;
		else
			return -1;
		// TODO Auto-generated method stub
	}

}
