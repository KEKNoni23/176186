package AA.EsercizioINGSW;

import java.util.LinkedList;
import java.util.List;

public class Math {
	public List<Integer> primeNumersGenerator(int n) {
		List<Integer> primeNumbers = new LinkedList<Integer>();
		if (n >= 2) {
			primeNumbers.add(2);
		}
		for (int i = 0; i <= n; i += 2) {
			if (isPrime(i)) {
				primeNumbers.add(i);
				System.out.println("Master");

			}
		}
		return primeNumbers;
	}

	public boolean isPrime(int number) {
		if (number < 2) {
			return false;
		}
		for (int i = 2; i * i < number; i++) {
			if (number % i == 0) {
				return false;
			}

		}
		return true;
	}

}
