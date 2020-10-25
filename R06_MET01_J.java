import java.io.*;
import java.lang.Math;

//MET01-J. Never use assertions to validate method arguments Given the non-compliant
//code below:

public class R06_MET01_J{
    public static void main(String[] args) {
		System.out.println(getAbsAdd(Integer.MIN_VALUE, 1));
	}
	
	public static int getAbsAdd(int x, int y){
		assert x != Integer.MIN_VALUE;
		assert y != Integer.MIN_VALUE;
		int absX = Math.abs(x);
		int absY = Math.abs(y);
		if (absX > Integer.MAX_VALUE - absY){
			throw new IllegalArgumentException();
		}
		return absX + absY;
	}
}