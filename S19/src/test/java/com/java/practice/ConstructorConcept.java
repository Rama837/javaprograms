package com.java.practice;

public class ConstructorConcept {
	//class Variables
	int a=10;
	String name;
	String b;

	public ConstructorConcept(){ // 0 Parameters
		System.out.println("non parameterised constructor");
		System.out.println(a + " " + name) ;
	}
	public ConstructorConcept(int i,String nombre){// 2 Parameters
		System.out.println(a + " " + nombre);
		a=i;
		name=nombre;
		System.out.println(a);
		System.out.println(i + " " + name);
	}
	public ConstructorConcept(int a,String game, String place){  // 3 Parameters
		System.out.println(a + " " + name + " " + place);
		System.out.println(name);
		this.name=game;
		System.out.println(game);
	}
	public ConstructorConcept(String a,String name ) {	//Always the constructor name is same as class name
		this.b=a; 			//Using this keyword we can initialise the global(class) variables with local variables
		this.name=name;		// this.classvar=localvar
		System.out.println(b+ " "+ name);
	}

	public static void main(String[] args) {
		ConstructorConcept obj=new ConstructorConcept();
		ConstructorConcept obj1=new ConstructorConcept(50,"Mam");
		ConstructorConcept obj3=new ConstructorConcept("80","Sam");
		ConstructorConcept obj4=new ConstructorConcept("30","jam");
		ConstructorConcept obj5=new ConstructorConcept(100,"Dam");
		ConstructorConcept obj2=new ConstructorConcept(300,"Ram","Hyd");


		System.out.println(obj1.name);
		System.out.println(obj2.name);//this. is not mentioned
		System.out.println(obj3.name);
	}



}
//Constructor is like a function
//it doesn't return any value
//we can't write a return statement
//constructor can't be created inside a method
//Constructor can be overloaded
//default constructor, parameterized constructor.
//const are used to initialise the properties of class
