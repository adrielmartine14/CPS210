import java.util.Scanner;
public class SmallestElement
{
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter 10 double values: ");
		double[] doubleArray= new double[10];
		for (int i=0;i<doubleArray.length;i++) {
			doubleArray[i]=input.nextDouble();
		}
		//
		System.out.print(min(doubleArray));
	}
	public static double min(double[] array){
		double min= array[0];
		for (int i=1;i<array.length;i++) {
			if (min > array[i]) {
				min=array[i];
			}
		}
		return min;
	}
}