import java.io.*;

//NUM03-J. Use integer types that can fully represent the possible range of unsigned data
//Given the non-compliant code below:

public class R03_NUM03_J{
    public static void main(String[] args) {
		String str = "2321453214";
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
		return is.readInt();
	}
}