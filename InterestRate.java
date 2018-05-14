import java.util.Scanner;
public class InterestRate
{
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter balance and annual interest rate: ");
		int x= input.nextInt();
		double y= input.nextDouble();
		//Computations
		double a= x*(y/1200);
		System.out.println("The interest is "+a);
	}
}