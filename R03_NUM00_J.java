import java.io.*;

//Detect or prevent integer overflow

public class R03_NUM00_J{
		
	public static void main(String[] args) {
		System.out.println(multiply(100,3902));
	}
	
	public static int multiply(int x, int y)
	{
		return x*y;
	}
}