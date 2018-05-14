import java.util.Scanner;
public class Double
{
	public static void main(String[] args)
	{
		Scanner input= new Scanner(System.in);
		System.out.println("Enter a double value: ");
		double x= input.nextDouble();
		System.out.println("Your input was: " + x );
		System.out.println("Cube of the number is: " + x*x*x);
	}
}
