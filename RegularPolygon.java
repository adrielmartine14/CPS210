import java.util.Scanner;
public class RegularPolygon
{
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.print("Enter number of sides: ");
		int n= input.nextInt();
		System.out.println("Enter lenght of a side: ");
		double s= input.nextDouble();
		//Computations
		System.out.println("Area, A= "+ (0.25*s*s*n*(1/MATH.tan(MATH.PI/n))));
		System.out.println("Radius of the circumscribing circle, R = "+ (0.5*s*(1/MATH.sin(MATH.PI/n))));
		System.out.println("Radius of the inscribed circle, r = "+ (0.5*s*(1/MATH.tan(MATH.PI/n))));
	}
}