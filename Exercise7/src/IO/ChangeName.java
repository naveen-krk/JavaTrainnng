package IO;

import java.io.File;
import java.io.IOException;

public class ChangeName {
	public static void main(String[] args) throws IOException {
		File oldfile = new File("oldfile.txt");
		File newfile = new File("newfile.txt");
		oldfile.createNewFile();
		if (oldfile.renameTo(newfile)) {
			System.out.println("File name succesfully changed");
		} else {
			System.out.println("Rename failed");
		}
	}
}
