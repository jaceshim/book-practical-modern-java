package chapter2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {

	@Test
	void diamond_extends_problems() {
		Worker worker = new Worker("David", 23, Worker.FEMALE);
		System.out.println(worker.getInformation() + ", " + worker.getSex());

		// Can't use super in a static context
//		Female.super.getSex();

		Assertions.assertTrue(true);
	}
}
