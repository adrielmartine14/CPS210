import java.util.Scanner;
public class MingleArrays
{
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("First Array: ");
		int[] A1= new int[5];
		for (int i=0;i<A1.length;i++) {
			A1[i]= input.nextInt();
		}
		System.out.println("Second Array: ");
		int [] A2= new int[5];
		for (int i=0;i<A2.length;i++) {
			A2[i]= input.nextInt();
		}
		mingleArray(A1,A2);
	}
	public static int[] mingleArray(int[] a1, int[] a2){
		int[] a= new int[a1.length+ a2.length];
		int x=0;
		for (int i=0;i<a.length;i++) {
			if (i%2==0) {
				a[i]= a1[i/2];
			}
			else {
				a[i]=a2[x];
				x++;
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		return a;
	}
}