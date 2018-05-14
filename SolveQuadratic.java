import java.util.Scanner;
public class SolveQuadratic
{
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the coefficients a, b, c, making sure b^2> 4*a*c: ");
		int a= input.nextInt();
		int b= input.nextInt();
		int c= input.nextInt();
		//Computations
		double x1= (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
		double x2= (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);

		System.out.println("Roots are: "+x1+" "+x2);
	}
}