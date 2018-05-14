public class LargestIntN
{
	public static void main(String[] args) {
		int n=100;
		while (Math.pow(n,3)>12000) {
			if (Math.pow(n,3)<12000) {
				System.out.println(n);
			}
			n--;
		}
		System.out.println("Largest integer where n cubed is less than 12000: "+n);
	}
}