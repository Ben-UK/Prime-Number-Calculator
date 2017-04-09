
public class PrimeCalculator {
long startTime = System.currentTimeMillis();
	long n;
	long i;
	long counter = 0;
	long nonprimecount;
	long primecount;
	
	public void calculator() {

		for (long i = 1_000_001; i <= 3_000_000; i+=2, counter = 0) {

			for (long j = 2; j <= 1000; j++) {

				if (i % j == 0) {

					counter++;
					
				}

				else {

				}
				
				//System.out.prlongln(i + " = " + j );

			}
			
			if (counter < 2) {
				
				
				primecount++;
				System.out.println(i + " IS A PRIME NUMBER!");
				
			}

			else {
				nonprimecount++;

			}

		}
System.out.println("The Are " + nonprimecount + " Non-Prime numbers and "  + primecount + " Prime numbers between 2 and " + ((nonprimecount + primecount) * 2));		
long endTime   = System.currentTimeMillis();
long totalTime = endTime - startTime;
System.out.println("This calculation took: " + (totalTime/1000) + " Seconds");
	}

}