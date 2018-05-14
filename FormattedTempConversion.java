import java.util.Scanner;
public class FormattedTempConversion
{
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.print("Enter 5 Celsius degree values: ");
		double c1= input.nextDouble();
		double c2= input.nextDouble();
		double c3= input.nextDouble();
		double c4= input.nextDouble();
		double c5= input.nextDouble();
		//computations
		double f1= c1*(9.0/5)+32;
		double f2= c2*(9.0/5)+32;
		double f3= c3*(9.0/5)+32;
		double f4= c4*(9.0/5)+32;
		double f5= c5*(9.0/5)+32;
		//
		System.out.printf("%-7s %-11s\n", "Celsius","Fahrenheit");
		System.out.printf("%-7s %-11s\n", "-------", "----------");
		System.out.printf("%.2f\t%.2f\n", c1, f1);
		System.out.printf("%.2f\t%.2f\n", c2, f2);
		System.out.printf("%.2f\t%.2f\n", c3, f3);
		System.out.printf("%.2f\t%.2f\n", c4, f4);
		System.out.printf("%.2f\t%.2f\n", c5, f5);
	}
}