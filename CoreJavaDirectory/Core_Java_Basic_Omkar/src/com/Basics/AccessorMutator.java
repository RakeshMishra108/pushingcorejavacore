package com.Basics;
import java.util.Scanner;
public class AccessorMutator {//class name always TitleCased  //Members 6 : 2 variables , 4 methods
	private String name;//Instance or object variable		//class, reference ,object type variables
	private int moons;//Instance or object variable //primitive data type variables
	static int count;//class variables   //only variables,methods can be declared static and not constructors
	//static methods can access only static members and not non static members including this. reference where as non-static members can access both static and non-static members
	Scanner sc = new Scanner(System.in);
	public AccessorMutator() {		//Can be generated From source menu bar constructor using superclass
		name = "noname";
		moons = 0;
		count++;
	}
	public String getName() { 		//Can be generated From source menu bar
		return name;
	}
	public AccessorMutator(String name, int moons) {//Local variables name,moons	//Can be generated from source menu bar constructor using fields
		super();
		this.name = name;
		this.moons = moons;
		count++;
	}
	public void setName() {		//method name always CamelCased
		System.out.println("Enter the Name : ");
		name = sc.nextLine();
		this.name = name;
	}
	public int getMoons() {
		return moons;
	}
	public void setMoons() {
		System.out.println("Enter the number of moons : ");
		moons = sc.nextInt();
		this.moons = moons;
	}
	
}
