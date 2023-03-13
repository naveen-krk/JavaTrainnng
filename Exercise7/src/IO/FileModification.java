package IO;

import java.io.File;
import java.io.IOException;

public class FileModification {
	public static void main(String[] args) throws IOException {
		File f = new File("FileModification.txt");
		try {
			 // file to be delete
				if (f.delete()) // returns Boolean value
				{
					System.out.println(f.getName() + " deleted");
					return;// getting and printing the file name
				} else {
					f.createNewFile();
					f.delete();
					System.out.println(f.getName() + " deleted");
				}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}