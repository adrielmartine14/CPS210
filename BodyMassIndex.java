import java.util.Scanner;
public class BodyMassIndex
{
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.print("Enter weight in pounds: ");
		double x= input.nextDouble();
		System.out.print("Enter height in inches: ");
		double y= input.nextDouble();
		//Computation
		double BMI= (x/y/y)*(703);
		System.out.println("BMI is: "+ BMI);
		//if else statements
		if (BMI < 18.5) {
			System.out.println("Underweight");
		}
		else if (BMI <= 25) {
			System.out.println("Normal");
		}
		else if (BMI <=30) {
			System.out.println("Overweight");
		}
		else
			System.out.println("Obese");

	}
}