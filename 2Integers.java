import java.util.Scanner;
public class TwoIntegers
{
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Give 2 integers, the second being larger than the first: ");
		int x= input.nextInt();
		int y= input.nextInt();
		//
		for (int x;x<=y;x++) {
			if (x%2==0) {
				System.out.println(x);
			}
		}

	}
}