import java.util.Scanner;
public class TempRange
{
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.print("Enter the month as an integer(Jan=1, Feb=2, etc): ");
		int x= input.nextInt();
		//Conditionals
		if (x= 12 || x=1 || x=2 || x=3) {
			System.out.println("It's cold, 20 to 40 degrees");
		}
		else if (x=6 || x=7 || x=8 || x=9 ) {
			System.out.println("It's warm, 50 to 80 degrees");
		}
		else if (x=4 || x=5 || x=10 || x=11) {
			System.out.println("It's moderate, 40 to 50 degrees");
		}
		else
			System.out.println("Bad input!");
	}
}