import java.util.*;
import java.io.*;

public class FileAccess {

    public ArrayList<String> readFile(String fileLocation) {
	
	String line = "";
	ArrayList<String> fileData = new ArrayList<String>();

	for (int j =0 ; j < 25; j++) {
	    fileData.add("Have a holly jolly Christmas!");
	}
	
	// try {
	//     FileReader fileReader = new FileReader(fileLocation);

        //     BufferedReader bufferedReader = new BufferedReader(fileReader);

	//     String line = "";
	    
        //     while((line = bufferedReader.readLine()) != null) {
	// 	fileData.add(line);
        //     }   

        //     // Always close files.
        //     fileReader.close();         
        // }
        // catch(Exception ex) {
        //     System.out.println("Problem reading file: " + fileLocation);
	// }
	return fileData;
    }
    
}
