import java.io.*;
import java.math.BigInteger;

//STR03-J. Do not encode noncharacter data as a string Given the non-compliant code
//below:

public class R04_STR03_J{
    public static void main(String[] args) {
		BigInteger x = new BigInteger("530500452766");
		String s = x.toString(); // Valid character data
		byte[] byteArray = s.getBytes();
		String ns = new String(byteArray);
		x = new BigInteger(ns);
		System.out.println(x);
	}
}