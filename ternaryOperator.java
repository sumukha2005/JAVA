import java.util.Scanner;

public class ternaryOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the time: ");
        int time = scanner.nextInt();

	String result = (time<18)?"Good day!" : "Good evening!";
        System.out.printf(result);

        scanner.close();
    }
}