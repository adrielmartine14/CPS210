import java.util.Scanner;
public class divisibility
{
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter an integer value: ");
		int x= input.nextInt();
		//Conditionals
		if (x%5==0 && x%6==0) {
			System.out.println(x+" is divisible by 5 and 6");
		}
		else {
			System.out.println(x+" is not divisible by 5 and 6");
		}
		if (x%5==0 || x%6==0) {
			System.out.println(x+" is divisible by 5 or 6");
		}
		else {
			System.out.println(x+" is not divisible by 5 or 6");
		}
	}
}