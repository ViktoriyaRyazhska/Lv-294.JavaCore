package fourth.exercise;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ExternalFile {
	private BufferedWriter bw;
	private String fromFile;
	private String toFile;

	public ExternalFile(String fromFile, String toFile) throws IOException {
		this.bw = new BufferedWriter(new FileWriter(toFile));
		this.toFile = toFile;
		this.fromFile = fromFile;
	}

	public void writeIntoFile() throws IOException {
		ListOfString listFromFile = new ListOfString(fromFile);
		Lines ln = new Lines(listFromFile);
		Description des = new Description(listFromFile);
		write("Number of line in " + "[" + fromFile + "]" + ": " + ln.numberOfLines());
		write("The longest line in " + "[" + fromFile + "]" + ": ");
		write("\"" + ln.longestLine() + "\"");
		write("Name: " + "[" + des.findWord("Name:") + "]");
		write("Birthday: " + "[" + des.findWord("Birthday:") + "]");
	}

	private void write(String st) throws IOException {
		bw = new BufferedWriter(new FileWriter(toFile, true));
		bw.append(st);
		bw.newLine();
		bw.close();
	}
}
