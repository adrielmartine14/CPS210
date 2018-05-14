import java.util.Scanner;
public class GPA
{
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Input a value between 0.0 and 4.0");
		double gpa= input.nextDouble();
		//conditionals 
		if (gpa >= 0.0 && gpa<= 4.0) {
			if (gpa >= 3.8) {
				System.out.println("Excellent");
			}
			else if (gpa >= 3.4) {
				System.out.println("Very Good");
			}
			else if (gpa >= 3) {
				System.out.println("Good");
			}
			else if (gpa >= 2.5) {
				System.out.println("Average");
			}
			else
				System.out.println("Poor");
		}
		else
			System.out.println("Bad input");
	}
}