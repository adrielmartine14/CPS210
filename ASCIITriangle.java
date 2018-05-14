import java.util.Scanner;
public class ASCIITriangle
{
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Give me an int: ");
		int n= input.nextInt();
		//
		for (int i=1;i<=n;i++) {
			for(int k=n;k>=i;k--) {
				System.out.print(" ");
				}
			for (int j=i;j>=1;j--) {
				System.out.print(""+j);
			}
			System.out.println();
		}
	}
}