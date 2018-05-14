import java.util.Scanner;
public class DivisibleBy5or6
{
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter a integer: ");
		int x= input.nextInt();
		//computations
		if (x%5==0 && x%6==0) {
			System.out.println(x+" is divisible by 5 and 6.");
		}
		else if (x%5==0 ^ x%6==0) {
			System.out.println(x+" is divisible either by 5 or 6, but not both.");
		}
		else if (x%5==0 || x%6==0) {
			System.out.println(x+" is divisible by either 5 or 6.");
		}
	}
}