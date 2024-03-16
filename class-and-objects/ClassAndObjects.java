package loops;

public class ClassAndObjects {
	public static void main(String[] args) {
		Student s1 = new Student(); //Object
		s1.name = "Chetan";
		s1.id = 1;
		s1.learns();
//		
//		Student s2 = new Student(); //Object
//		s2.name = "Chitra";
//		s2.id = 2;
//		s2.learns();
	}
}

class Student {
	// Features/Attributes, name, id
	String name;
    int id;
    
// Actions/Behaviors, Go to school/college, write exam, Learning
    public void goToSchool() {
    	System.out.println("Students travel to school");
    }

    public void learns() {
    	int x = 10, y = 20;
    	int result = 20;
    	System.out.println("Student learn addition :"+result);
    }
    
}
