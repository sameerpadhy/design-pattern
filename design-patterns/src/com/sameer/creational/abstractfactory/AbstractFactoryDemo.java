package com.sameer.creational.abstractfactory;

public class AbstractFactoryDemo {

		static DoorFactory factory;
		
	public static void main(String[] args) {
		
		factory=new WoodenDoorFactory();
		System.out.println(factory.getDoor().getDescription() +"-"+ factory.getExpert().fittingExprt());
		
		factory=new IronFactory();
		System.out.println(factory.getDoor().getDescription() +"-"+ factory.getExpert().fittingExprt());
		
		

	}

}

interface Door{
	 String getDescription();
}
class WoodenDoor implements Door{

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "Wooden Door";
	}
	
}
class IronDoor implements Door{

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "Iron Door";
	}
	
}

interface DoorfittingExpert{
	 String fittingExprt();
}

class WoodenDoorFittingExpert implements DoorfittingExpert{

	@Override
	public String fittingExprt() {
		// TODO Auto-generated method stub
		return "Carpenter";
	}
	
}

class IronDoorFittingExpert implements DoorfittingExpert{

	@Override
	public String fittingExprt() {
		// TODO Auto-generated method stub
		return "Welder";
	}
	
}

interface DoorFactory {
	DoorfittingExpert getExpert();
	Door getDoor();
}

class WoodenDoorFactory implements DoorFactory{

	
	@Override
	public DoorfittingExpert getExpert() {
		// TODO Auto-generated method stub
		return new WoodenDoorFittingExpert();
	}

	@Override
	public Door getDoor() {
		// TODO Auto-generated method stub
		return new WoodenDoor();
	}
	
}

class IronFactory implements DoorFactory{

	@Override
	public DoorfittingExpert getExpert() {
		// TODO Auto-generated method stub
		return new IronDoorFittingExpert();
	}

	@Override
	public Door getDoor() {
		// TODO Auto-generated method stub
		return new IronDoor();
	}
	
}
