package constructors;

//User define class
class Student{
	String name;
	String qualification;
	int age;
	
	Student(String name){           //constructor - 1
		System.out.println("Constructor with one argument - String : "+name);
	}
	Student(String name, int age){  //constructor - 2
		System.out.println("Constructor with two argument - String : "+name+" "+age);
	}
	Student(String name, int age, String qualification){           //constructor - 3
		System.out.println("Constructor with three argument - String : "+name+" "+age+" "+qualification);
	}
	void study(){             //method - 1
		System.out.println("Student in studying.");
	}
	void run(){               //method - 2
		System.out.println("Student is running.");
	}
	void sleep() {
		System.out.println("Student is sleeping.");
	}
}

public class Constructor {
	public static void main(String[] args) {
		//new Student(); //explicitly while creation of object we call the object. 
		Student s1 = new Student("Anuj");
		Student s2 = new Student("Anuj M", 22);
		Student s3 = new Student("Anuj Manwatkar", 22, "B.Tech");
		s1.study();
		s1.run();
		s1.sleep();

		
	}

}
