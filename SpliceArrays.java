import java.util.Scanner;
public class SpliceArrays
{
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("First Array: ");
		int[] A1= new int[10];
		for (int i=0;i<A1.length;i++) {
			A1[i]= input.nextInt();
		}
		System.out.println("Second Array: ");
		int [] A2= new int[10];
		for (int i=0;i<A2.length;i++) {
			A2[i]= input.nextInt();
		}
		spliceArray(A1, A2);
	}
	public static int[] spliceArray(int[] a1, int[] a2){
		int[] a= new int[a1.length+a2.length];
		for (int i=0;i<a1.length;i++) {
			System.out.print(a1[i]+" ");
		}
		for (int i=0;i<a2.length;i++) {
			System.out.print(a2[i]);
		}
	}
	return a;
}