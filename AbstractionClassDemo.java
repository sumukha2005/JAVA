abstract class Shape{
	abstract void draw();
	
	void display(){
		System.out.println("This is shape.");
	}
}
	
class circle extends Shape{
	@Override
	void draw(){
		System.out.println("Drawing a circle");
	}	
}

class AbstractionClassDemo{
	public static void main(String[] args){
		Circle.C1=new Circle();
		C1.show();
	}
}
	
	


