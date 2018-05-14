import java.util.Scanner;
public class DigitsSums
{
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter a integer: ");
		long n= input.nextLong();
		System.out.println(sumDigits(n));
	}
	public static int sumDigits(long n)
	{
		int sum=0;
		while (n>0) {
			sum +=n%10;
			n =n/10;
		}
		return sum;
	}
}