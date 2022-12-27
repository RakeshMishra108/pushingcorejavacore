package practice_exam;

public class Employee {
	 int empid;
	String name ;
	static String comp="Java Industry";

	public Employee() {
		
	}
	public Employee(int empid, String name) {
		this.empid = empid;
		this.name = name;
		this.comp = comp;
	}
//	void display () {
//		System.out.println(empid +" : "+name+" : "+comp);
//	}
	
	public static void main (String[] args) {
		Employee e1=new Employee(45,"Ramu");
		System.out.println(Employee.comp);
//		e1.display();
//		Employee e2=new Employee();
//		e2.display();
	}
	

}
