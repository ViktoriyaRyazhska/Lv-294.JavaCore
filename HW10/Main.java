package hw10;

import java.io.IOException;

import hw10.task4.FileApplication;

public class Main {
	public static void main(String[] args) throws IOException {
		try (FileApplication app = new FileApplication("file1.txt", "file2.txt")) {
			app.start();
		}
	}
}
