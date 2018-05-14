import java.util.Scanner;
public class SumOfEvenInts
{
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Give 2 integers, the second being larger than the first: ");
		int x= input.nextInt();
		int y= input.nextInt();
		//
		for (int z=x;z<=y;z++) {
			if (z%2==0) {
				System.out.println(z+z);
			}
		}
	}
}