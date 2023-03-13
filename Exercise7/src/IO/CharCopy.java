package IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CharCopy {
	public static void main(String[] args){
		File source = new File("source.txt");
		FileOutputStream outputStream = null;
		FileInputStream inputStream = null;
		try {
			source.createNewFile();
			File destination = new File("outputFile.txt");
			inputStream = new FileInputStream(source);
			outputStream = new FileOutputStream(destination);
			int length = (int) source.length();
			byte[] buffer = new byte[length];
			while ((length = inputStream.read(buffer)) > 0) {
				outputStream.write(buffer, 0, length);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				inputStream.close();
				outputStream.close();
				System.out.println("File copied.....");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
