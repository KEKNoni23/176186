package AA.EsercizioINGSW;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.LinkedList;

import org.junit.BeforeClass;
import org.junit.Test;

public class AppTest {

	private static Math math;

	@BeforeClass
	public static void prepare() {
		math = new Math();
	}

	@Test
	public void primeNumbersGeneretorWorks() {
		assertEquals(new LinkedList<Integer>(), math.primeNumersGenerator(1));
		assertEquals(Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19), math.primeNumersGenerator(20));
	}

}
