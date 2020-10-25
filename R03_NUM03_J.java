import java.io.*;

public class R03_NUM03_J{
    public static void main(String[] args) {
		String str = "26543";
		InputStream is = new ByteArrayInputStream(str.getBytes());
		DataInputStream ds = new DataInputStream(is);
		try {
		System.out.println(getInteger(ds));
		}
	    catch (IOException io) {
	    //
	    }
    }
	
	public static int getInteger(DataInputStream is) throws IOException {
		return is.readInt()&0xFFFFFFFF;
	}
}