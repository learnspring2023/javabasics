package oop;

public class Constructor {
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student(1,"Chetan");
		System.out.println(s1.getName());
		System.out.println(s2.getName());
		System.out.println(s3.getName());
	}
}

class Student {
	private int id;
	private String name;
	private String branch;
	//Method - Parameterized Constructor, used to
	//initialized instance variables
	Student (int id, String name) {
		System.out.println("Parameter constructor called");
		this.id = id;
		this.name=name;
		this.branch="CS";
	}

	//Default constructor
	Student () {
		System.out.println("Default constructor called");
		this.id = 99;
		this.name="Defaut name";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	
}
