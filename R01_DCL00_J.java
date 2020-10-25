import java.io.*;
import java.lang.Math;

public class R01_DCL00_J {
  private final int doubled;
  private static final R01_DCL00_J test = new R01_DCL00_J();
  private static final int val = (int) (Math.random() * 100); // Random deposit
  public R01_DCL00_J() {
    doubled = val + val; // Subtract processing fee
  }
 
  public static void main(String[] args) {
    System.out.print("The value of ");
	System.out.print(val);
	System.out.print(" doubled is: ");
	System.out.print(test.doubled);
  }
}