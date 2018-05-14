import java.util.Scanner;
public class Integer
{
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter an int value: ");
		double x=input.nextInt();
		System.out.println("Your input was: " + x );
		System.out.println("Cube of the number is: " + x*x*x);
	}
}