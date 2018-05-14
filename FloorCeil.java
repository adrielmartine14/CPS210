import java.util.Scanner;
public class FloorCeil
{
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.print("Input a double value: ");
		double x= input.nextDouble();
		//formula 1
		System.out.println("Floor of ceiling of x: "+ Math.floor(Math.ceil(x)));
		System.out.println("Ceiling of x "+ Math.ceil(x));
		//formula 2
		System.out.println("Ceiling of floor of x: "+ Math.ceil(Math.floor(x)));
		System.out.println("Floor of x "+ Math.floor(x));
	}
}