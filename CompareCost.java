import java.util.Scanner;
public class CompareCost
{
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.print("Enter weight and price for package 1: ");
		int x1= input.nextInt();
		double x2= input.nextDouble();
		System.out.print("Enter weight and price for package 2: ");
		int y1= input.nextInt();
		double y2= input.nextDouble();
		//Conditionals
		if ((x2/x1)>(y2/y1)) {
			System.out.println("Package 2 is a better deal");
		}
		else if ((x2/x1)<(y2/y1)) {
			System.out.println("Package 1 is a better deal");
		}
		else
			System.out.println("Prices are the same");	
	}
}