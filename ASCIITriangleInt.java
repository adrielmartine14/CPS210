import java.util.Scanner;
public class ASCIITriangleInt
{
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.print("Give me an int: ");
		int n= input.nextInt();
		trianglePattern(n);
	}
	public static int trianglePattern(int n){
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
}