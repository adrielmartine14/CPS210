import java.util.Scanner;
public class PrintTrinagle1
{
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.print("Give me an int: ");
		int n= input.nextInt();
		//
		for (int i=1;i<=n;i++) {
			for (int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}