package com.Basics;

public class AccessorMutatorMain {

	public static void main(String[] args) {
		
		AccessorMutator Earth = new AccessorMutator(); //first obj
		AccessorMutator Mars = new AccessorMutator(); //Second obj
		AccessorMutator Jupiter = new AccessorMutator("Jupiter",16); //Third obj
		System.out.println("Inital values of Object Earth : "+Earth.getName()+" "+Earth.getMoons());
		System.out.println("Inital values of Object Mars: "+Mars.getName()+" "+Mars.getMoons());
		Earth.setName();
		Earth.setMoons();
		Mars.setName();
		Mars.setMoons();
		
		System.out.println("Name of the Planet : "+Earth.getName());
		System.out.println("Number of Moons : "+Earth.getMoons());
		System.out.println("Name of the Planet : "+Mars.getName());
		System.out.println("Number of Moons : "+Mars.getMoons());
		System.out.println("Name of the Planet : "+Jupiter.getName());
		System.out.println("Number of Moons : "+Jupiter.getMoons());
		System.out.println("no. of Planets : "+AccessorMutator.count);
		
	}

}
