import java.util.*;

class addition{
	public static void main(String args[]){
		int a;
		int b;
		int c;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number:");
		a=sc.nextInt();
		System.out.println("Enter the second number:");
		b=sc.nextInt();

		c=a+b;

		System.out.println("Sum of two numbers:"+c);
	}
}