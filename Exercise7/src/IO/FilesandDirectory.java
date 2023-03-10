package IO;

import java.io.File;

public class FilesandDirectory {
	public static void main(String[] args) {
		File dirname = new File("/Users/naveenkrk/eclipse-workspace/Exercise7");
		if (dirname.isDirectory()) {
			String string[] = dirname.list();
			for (int i = 0; i < string.length; i++) {
				File f = new File(string[i]);
				if(f.exists() && !f.isDirectory()) { 
					System.out.println(string[i]);
				}
				else {
					System.out.println("Its a directory");
				}
				
			}
		}
		else
			System.out.println("not a directory");
	}
}