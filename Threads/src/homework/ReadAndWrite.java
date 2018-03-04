package homework;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

public class ReadAndWrite {
	private File file;
	private LinkedList<String> lines;

	public ReadAndWrite(File file) {
		this.file = file;
	}
	
	public void read() throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(file));
		String s = "";
		while((s = reader.readLine())!=null) {
			lines.add(s);
		}
		reader.close();
	}
	
	public void write(File f) throws IOException {
		BufferedWriter writer = new BufferedWriter(new FileWriter(f));
		writer.write(lines.size());
		writer.write(maxLength());
		writer.write("Maxym 1998/08/11");
		writer.close();
	}
	
	public int maxLength() {
		int maxL = 0;
		for(int   i = 0; i < lines.size(); i++) {
			if(maxL < lines.get(i).length()) {
				maxL = lines.get(i).length();
			}
		}
		return maxL;
	}
	
}
