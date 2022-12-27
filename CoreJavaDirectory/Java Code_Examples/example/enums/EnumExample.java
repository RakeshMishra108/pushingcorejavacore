package example.enums;

import java.util.Arrays;
import java.util.List;

public class EnumExample {

	public static void main(String[] args) {
		Course course1 = new Course();
		Course course2 = new Course("Java EE", "Seed Infotech", Mode.OFFLINE);
		Course course3 = new Course("SQL and PLSQL", "Oracle University", Mode.HYBRID);
		//Populating a list of courses
		List<Course> allCourses =  Arrays.asList(course1, course2, course3);
		
		//Printing all Courses
		for(Course course : allCourses) {
			System.out.println(course);
		}
		System.out.println("--------------------------");
		//Printing all OFFLINE courses
		for(Course course : allCourses) {
			Mode currentMode  = course.getTrainingMode();
			if(currentMode.equals(Mode.OFFLINE))
				System.out.println(course);
		}
	}

}
