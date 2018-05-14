import java.util.Scanner;
public class ArrayEx
{
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.print("Enter 8 integers seperated by spaces: ");
		int[] intArray= new int[8];
		for (int i=0;i<intArray.length;i++) {
			intArray[i]=input.nextInt();
		}
		//
		int sum=0;
		for (int i=0;i<intArray.length;i++) {
			sum+=intArray[i];
		}
		System.out.println("Sum is "+sum);
		System.out.println("Average is "+sum/intArray.length);
	}
}