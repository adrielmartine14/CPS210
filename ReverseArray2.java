import java.util.Scanner;
public class ReverseArray2
{
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.print("Enter 10 integers seperated by spaces: ");
		int[] intArray= new int[10];
		for (int i=0;i<intArray.length;i++) {
			intArray[i]=input.nextInt();
		}
		//
		System.out.println("Array in reverse order:");
		for (int i=intArray.length-1; i>=0; i--) {
			System.out.print(intArray[i]+" ");
		}
	}
}