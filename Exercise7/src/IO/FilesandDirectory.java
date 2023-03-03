package IO;

import java.io.File;

public class FilesandDirectory {
	public static void main(String[] args) {
		File dirname = new File("/Users/naveenkrk/eclipse-workspace/Exercise7/src/IO");
		if (dirname.isDirectory()) {
			String string[] = dirname.list();
			for (int i = 0; i < string.length; i++) {
				System.out.println(string[i]);
			}
		}
	}
}