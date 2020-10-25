import java.io.*; 

public void deleteFile(){
	File someFile = new File("someFileName.txt");
	// do something with someFile
	
	//Checkl to ensure return value in delete()
	if(!someFile.delete()){
		//handle failure
	}
}
