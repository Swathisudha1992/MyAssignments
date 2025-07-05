package week1.day2;

public class IsPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=13;
		int count=0;
		if (n<=1) {
			System.out.println(n + "is not a prime");
			
		} else {
			for (int i = 2; i < n; i++) {
				if (n%i==0) {
				count++;	
				}
				
			}

		}
		if (count==0) {
			System.out.println(n + "is a prime number");
		} else {
			System.out.println(n + "is not a prime number");

		}
		
		

	}

}

