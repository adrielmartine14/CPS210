import java.util.Scanner;
public class ArrayMethods
{
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter 10 double values: ");
		double[] doubleArray= new double[10];
		for (int i=0;i<doubleArray.length;i++) {
			doubleArray[i]=input.nextDouble();
		}
		System.out.print("The average of this array is: "+average(doubleArray));
	}
	public static int average(int[] array){
		int sum=0;
		for (int i=0;i<array.length;i++) {
			sum+=array[i];
		}
		return (sum/array.length);
	}
	public static double average(double[] array){
		double sum=0;
		for (int i=0;i<array.length;i++) {
			sum+=array[i];
		}
		return (sum/array.length);
	}
}