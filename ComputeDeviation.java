import java.util.Scanner;
public class ComputeDeviation
{
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter 10 numbers: ");
		double[] doubleArray= new double[10];
		for (int i=0;i<doubleArray.length;i++) {
			doubleArray[i]=input.nextDouble();
		}
		System.out.println("The mean is: "+mean(doubleArray));
	}
	public static double mean(double[] array){
		double sum=0;
		for (int i=0;i<array.length;i++) {
			sum+=array[i];
		}
		return (sum/array.length);
	}
	public static double deviation(double[] array){
		double m= mean(array);
		double sum=0;
		for (int i=0;i<array.length;i++) {
			sum+=Math.pow(array[i]-m,2);
		}
		return Math.sqrt(sum/m-1);
	}
}