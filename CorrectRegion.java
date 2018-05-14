import java.util.Scanner;
public class CorrectRegion
{
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter a number for t: ");
		int t= input.nextInt();
		//
		if (t>80) {
			System.out.println("Red region");
		}
		else if (t>70) {
			System.out.println("Green region");
		}
		else if (t>60) {
			System.out.println("Cyan region");
		}
		else if (t>50) {
			System.out.println("Yellow region");
		}
		else
			System.out.println("Blue region🔷");
	}
}