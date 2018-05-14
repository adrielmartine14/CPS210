import java.util.Scanner;
public class DivisiblebyFive
{
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Give 2 integers, the second being larger than the first: ");
		int x= input.nextInt();
		int y= input.nextInt();
		//
		while (y>x) {
			if (x%5==0) {
				System.out.println(x);
			}
			x++;
		}
	}
}