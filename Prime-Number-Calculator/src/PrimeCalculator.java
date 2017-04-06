
public class PrimeCalculator {

	int n;
	int i;
	int counter;

	public void calculator() {

		for (int i = 0; i <= 100; i++) {
System.out.println("The number of prime numbers is: " + n);
			for (int j = 2; j <= 100; j++) {

				if (i % j == 0) {

					counter++;
					n++;

				}

				else {

				}
				
				System.out.println(i + " = " + j );

			}

		}
		

	}

}