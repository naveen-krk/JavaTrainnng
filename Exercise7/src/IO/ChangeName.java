package IO;

import java.io.File;
import java.io.IOException;

public class ChangeName {
	public static void main(String[] args) {
		File oldfile = new File("/Users/naveenkrk/eclipse-workspace/Exercise7/src/IO/olffilename.txt");
		File newfile = new File("/Users/naveenkrk/eclipse-workspace/Exercise7/src/IO/newfile.txt");
		try {
			oldfile.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		if (oldfile.renameTo(newfile)) {
			System.out.println("File name succesfully changed");
		} else {
			System.out.println("Rename failed");
		}
	}
}
