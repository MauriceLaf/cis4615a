import java.io.*;

//Enable serialization compatibility during class evolution

public class R14_SER00_J implements Serializable{
	public static char c = 'c';
	public static void main(String[] args) {
		System.out.println(toString(c));
	}
	public static String toString(char c) {
		return String.valueOf(c);
	}
}
	