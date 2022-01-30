package Maps;

import java.util.HashMap;
import java.util.Map;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,Student> students = new HashMap<>();
		Student s1 = new Student();
		s1.setId(1);
		s1.setName("yan");
		Student s2 = new Student();
		s2.setId(2);
		s2.setName("liu");
		students.put(s1.getId(),s1);
		students.put(s2.getId(),s2);
		
		for (Integer i : students.keySet()) {
			System.out.println(students.get(i).getName());
		}
		

	}

}
