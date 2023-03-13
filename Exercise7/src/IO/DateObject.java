package IO;

import java.io.*;
import java.util.Date;

public class DateObject {
	public static void main(String[] args) {
		// Write Date object to file
		try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("date.txt"))) {
			Date date = new Date();
			outputStream.writeObject(date);
			System.out.println("Date object written to file.");
		} catch (IOException e) {
			e.printStackTrace();
		}
		// Read Date object from file
		try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("date.txt"))) {
			Date date = (Date) inputStream.readObject();
			System.out.println("Date object read from file: " + date);
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}