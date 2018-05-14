import java.util.Scanner;
public class SumOfDigits
{
	public static void main(String[] args) 
	{
		Scanner input= new Scanner(System.in);
		System.out.println("Enter a number between 0 and 1000: ");
		int a= input.nextInt();
		int a1= a%10;
		int a2= a/10;
		int b1= a2%10;
		int b2= a2/10;
		int c1= b2%10;

		System.out.println("The sum of digits is: " +(a1+b1+c1));
	}
}