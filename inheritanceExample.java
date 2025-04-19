class Human {
    String name;
    int age;


    Human(String n, int a) {
        name = n;
        age = a;
        System.out.println("I'm just born");
    }


    void speak() {
        System.out.println("My name is " + name + " and I am " + age + " years old.");
    }
}

class Student extends Human {
    String StudentID;
    String Standard;

   
    Student(String n, int a, String sID, String std) {
        super(n, a);
        StudentID = sID;
        Standard = std;
    }

    
    void speak() {
        super.speak();
        System.out.println("I'm studying in standard " + Standard + " and my ID is " + StudentID);
    }
}

class PG_Student extends Student{
	String specialization;
	
	PG_Student(String name,int age,String StudentID,String Standard ,String specialization){
		super(name,age,StudentID,Standard);
		this.specialization=specialization;
	}
	void research(){
		System.out.println("I'm Post gradute Student specialization in " + specialization);
	}
	void speak(){
		super.speak();
		research();
	}

}

	

public class inheritanceExample {
    public static void main(String[] args) {
        Human h = new Human("Manav", 20);
        Student s = new Student("Sumukha", 17, "CS218", "A");
	PG_Student p = new PG_Student("Shashank",20,"123","engg","data sc");

   
        h.speak();
	s.speak();
	p.speak();
	
    }
}