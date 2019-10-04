//package io.github.jwillenbring.travis.example;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class OperationsTest {

@Test
public void testSum() {
  Operations mySum = new Operations();
  double mySum.sum(1,2);
  assertEquals(mySum, 3);
  }
}
