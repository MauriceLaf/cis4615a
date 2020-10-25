import java.io.*;

//Detect or prevent integer overflow

public class R03_NUM00_J{
		
	public static void main(String[] args) {
		System.out.println(multiply(100,3902));
	}
	
	// Edit multiply to check for and prevent overflows
	public static int multiply(int x, int y)
	{
		if (y > 0 ? x > Integer.MAX_VALUE/y || 
		x < Integer.MIN_VALUE/y :
		(y < -1 ? x > Integer.MIN_VALUE/y
		: y == -1 && x == Integer.MIN_VALUE)){
			throw new ArithmeticException("Integer overflow");
		}
		return x * y;
	}
	
}