package IO;

import java.io.*;

public class ImageCopy {
	public static void main(String[] args) {
		try (InputStream in = new FileInputStream("sun.jpg"); OutputStream out = new FileOutputStream("moon.jpg")) {
			byte[] buffer = new byte[1024];
			int bytesRead;
			while ((bytesRead = in.read(buffer)) != -1) {
				out.write(buffer, 0, bytesRead);
			}
			for (int i = 0; i < buffer.length; i++) {
				System.out.print(buffer[i] + " ");
			}
			System.out.println("Image copied successfully.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}