package io.github.jwillenbring;

import org.junit.Assert;
import org.junit.Test;

class JUnit5TestForTravisExample {

	@Test
	void myTestForTravis() {
		String message = "This test should pass. 1.06+1.03 is within .02 of 2.1";
		System.out.println(message);
		Assert.assertEquals(message, 2.1, 1.06 + 1.03, 0.02);
	}

}
