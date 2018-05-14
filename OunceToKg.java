import java.util.Scanner;
public class OunceToKg
{
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		System.out.println("Enter weight in ounces: ");
		int oz= in.nextInt();
		//Computations
		double kg= oz/35.274;
		System.out.println(kg);
	}
}