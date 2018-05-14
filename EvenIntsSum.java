import java.util.Scanner;
public class EvenIntsSum
{
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Give 2 integers, the second being larger than the first: ");
		int x= input.nextInt();
		int y= input.nextInt();
		//
		while (y>=x) {
			if (x%2==0) {
				x=+x;
				System.out.println(x);
			}
			x++;		
		}
	}
}