package com.learning.cloning;

public class TestCloning {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Student student = new Student(10, "Raghu", new Contact("8105985300", "560024"));
		
		Student cloneObj = (Student) student.clone();		
		
		cloneObj.getContact().setPhoneNo("123");
		
		System.out.println("Student"+ student.toString());
		
		System.out.println("cloneObj"+ cloneObj.toString());
		
		
		Student cloneObj1= student;
		
		System.out.println("cloneObj1"+ cloneObj1.toString());


	}

}
