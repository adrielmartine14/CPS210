import java.util.Scanner;
public class Revolutions
{
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter Degrees: ");
		double x= input.nextInt();
		//computations
		double revolutions= x/360;
		System.out.println(revolutions);

	}
}