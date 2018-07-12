package com.sameer.creational.factory;

public class PersonFactory {
	 Person p;
	
	public  Person getPerson(String gender, String name) {
		if(gender.equalsIgnoreCase("M")) {
			p=new Male(name);	
		}
		else {
			p=new Female(name);	
		}
		return p;
	}

	
	public  static void main(String[] args) {
		// TODO Auto-generated method stub
		String gender="M";
		PersonFactory p=new PersonFactory();
		System.out.println(p.getPerson("M", "Sameer").getName());
		
		

	}

}

abstract class Person{
	public  String name;
	public Person(String name) {
		super();
		this.name = name;
	}
	public  abstract String getName() ;
	
}

class Male extends Person{
	public Male(String name) {
		super(name);
	}

	private  String salutation="Mr.";

	@Override
	public  String getName() {
		// TODO Auto-generated method stub
		return this.salutation+this.name;
	}
}

class Female extends Person{
	private  String salutation="Mrs.";
	public Female(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public  String getName() {
		// TODO Auto-generated method stub
		return this.salutation+this.name;
	}
}


