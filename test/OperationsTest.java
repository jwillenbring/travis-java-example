package io.github.jwillenbring.travis.example;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class OperationsTest {

@Test
public void testSum() {
  Sum mySum = new Sum();
  int mySum.sum(1,2);
  assertEquals(mySum, 3);
  }
}
