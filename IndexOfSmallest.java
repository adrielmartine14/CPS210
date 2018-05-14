import java.util.Scanner;
public class IndexOfSmallest
{
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter 10 double values: ");
		double[] doubleArray= new double[10];
		for (int i=0;i<doubleArray.length;i++) {
			doubleArray[i]=input.nextDouble();
		}
		//
		System.out.print("The index of the smallest element is at: "+indexOfSmallestElement(doubleArray));
	}
	public static int indexOfSmallestElement(double[] array){
		int index=0;
		double min= array[0];
		for (int i=1;i<array.length;i++) {
			if (min > array[i]) {
				min=array[i];
				index=i;
			}
		}
		return index;
	}
}