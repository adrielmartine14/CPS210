public class EvenDivisibleBy9
{
	public static void main(String[] args) {
		for (int i=1;i<=200;i++) {
			if (i%2==0) {
				if (i%9==0) {
					System.out.println(i);
				}
			}
		}
	}
}