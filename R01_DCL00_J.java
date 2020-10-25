import java.io.*;
import java.lang.Math;

//Prevent class initialization cycles.

public class R01_DCL00_J {
  private final int doubled;
  // Retrieve the final random value BEFORE creating the instance of the object
  private static final int val = (int) (Math.random() * 100);
  private static final R01_DCL00_J test = new R01_DCL00_J();
  public R01_DCL00_J() {
    doubled = val + val;
  }
 
  public static void main(String[] args) {
    System.out.print("The value of ");
	System.out.print(val);
	System.out.print(" doubled is: ");
	System.out.print(test.doubled);
  }
}