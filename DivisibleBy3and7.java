public class DivisibleBy3and7
{
	public static void main(String[] args) {
		for (int i= 0;i<1000;i++) {
			if (i%2==0) {
				if(i%3==0 && i%7==0){
					System.out.println(i);
				}
			}
		}
	}
}