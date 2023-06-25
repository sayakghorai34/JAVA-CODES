package p4;

import java.util.Comparator;

public class IdComp implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Student s1=(Student)o1;
		Student s2=(Student)o2;
		if(s1.getId()<s2.getId())
			return -1;
		else
			return 1;
		
		// TODO Auto-generated method stub
	}

}
