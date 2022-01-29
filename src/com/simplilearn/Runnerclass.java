package com.simplilearn;

public class Runnerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person per=new Person();
		ChildClass child=new ChildClass("Velankanni",29,"Programmer");
		
		MethodOverloading mo=new MethodOverloading();
		mo.Sum(2,4);
		mo.Sum(2,4,6);
		
		EncapsulationExample obj=new EncapsulationExample();
		
		obj.setName("Java");
		System.out.println(obj.getName());
		
		obj.setSalary(15439.45);
		System.out.println(obj.getSalary());
		
		obj.setAddress("Vellore");
		System.out.println(obj.getAddress());
	}

}
