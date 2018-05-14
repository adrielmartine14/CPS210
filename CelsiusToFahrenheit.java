import java.util.Scanner;
public class CelsiusToFahrenheit
{
	public static void main(String[] args) 
	{
		Scanner input= new Scanner(System.in);
		System.out.println("Enter a Celsius degree value: ");
		double x= input.nextDouble();
		System.out.println("Enter a degree in Celsius: " + x );
		System.out.println(x +" Celsius in Fahrenheit: "+ ((9.0/5)*x+32)  );
	}
}