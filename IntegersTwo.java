import java.util.Scanner;
public class IntegersTwo
{
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.print("Enter 2 integers, the second larger than the first: ");
		int x= input.nextInt();
		int y= input.nextInt();
		//
		while (y>x) {
			if (x%2==0) {
				System.out.println(x);
			}
			x++;
		}
	}
}