import java.util.Scanner;
public class Palindrome
{
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter a three-digit integer: ");
		int x= input.nextInt();
		//Conditionals
		if (x%10 == x/100) {
			System.out.println(x+" is a palindrome");
		}
		else
			System.out.println(x+" is not a palindrome");
	}
}