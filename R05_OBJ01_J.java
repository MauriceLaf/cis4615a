import java.io.*;

//Limit accessibility of fields

public class R05_OBJ01_J{
	private static int value = 100;
	
	// Implement a getter to retrieve the private variable
	public static int getValue(){
		return value;
	}
	
	public static void main(String[] args) {
		System.out.println(getValue());
	}
}