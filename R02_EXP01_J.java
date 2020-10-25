import java.io.*;
import java.util.Arrays;
import java.util.Iterator;

//Do not use a null in a case where an object is required

public class R02_EXP01_J {
	public static void main(String[] args) {
		Integer[] array = {100, 0, 32, 123, 439};
		Iterator<Integer> iterator = Arrays.stream(array).iterator();
		System.out.println(counter(array[1], iterator));
	}
	
	public static int counter(Integer obj, Iterator it){
		int count = 0;
		while(it.hasNext()){
			Object check = it.next();
			if ((null == obj && null == check)|| (obj.equals(check)))
			{
				count++;
			}
		}
		return count;
	}
}