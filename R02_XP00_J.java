import java.io.*; 

//IDS03-J. Do not log unsanitized user input Given the non-compliant code below:

public class R02_XP00_J{
    public static void main(String[] args) {
		public void deleteFile(){
			File someFile = new File("filename.txt");
			// do something
			someFile.delete();
		}
	}
}