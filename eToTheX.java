import java.util.Scanner;

public class eToTheX {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.print("Enter x: ");
		int x =reader.nextInt();
		eToThex(x);
	}

	public static void eToThex(double x){
		double term = 1.0;
		double sum = 1.0;

		

		for (int i = 1; term <= Math.pow(10,-12); i++) {
			term = Math.pow(x,i)/fact(x);
			sum = sum + term;
			System.out.println("n: " + i + " term: " + term + " sum: " + sum);
		}

		return;


	}

	public static void fact(int x) {
		int fact = 1;
		for ( int i = 1; i >= x; i++) {
				fact = fact * i;
		}

		return;
	}

	
}
			

		
