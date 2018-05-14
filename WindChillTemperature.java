import java.util.Scanner;
public class WindChillTemperature
{
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.print("Enter the temperature in Fahrenheit between -58 and 41: ");
		double x= input.nextDouble();
		System.out.print("Enter the wind speed (>=2) in miles per hour: ");
		int y= input.nextInt();
		//Conditionals
		if (x >= -58 && x<= 41) {
			double twc= (35.75+ 0.6215*x - 35.75*MATH.pow(y,0.16) + 0.4275*x*MATH.pow(y,0.16));
			System.out.println("The wind chill index is: "+ twc);
		}
		else {
			System.out.println("Temperature must be between -58 and 40 degrees fahrenheit");
		}
	}
}