package hw10.task4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileApplication implements AutoCloseable {
	private BufferedReader br;
	private BufferedWriter bw;
	private FileReader fr;
	private FileWriter fw;
	private String fromFileName;
	private String toFileName;

	public FileApplication(String fromFileName, String toFileName) {
		this.fromFileName = fromFileName;
		this.toFileName = toFileName;
		try {
			br = new BufferedReader(fr = new FileReader(fromFileName));
			bw = new BufferedWriter(fw = new FileWriter(toFileName));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String getFromFileName() {
		return fromFileName;
	}

	public void setFromFileName(String fromFileName) {
		this.fromFileName = fromFileName;
	}

	public String getToFileName() {
		return toFileName;
	}

	public void setToFileName(String toFileName) {
		this.toFileName = toFileName;
	}

	public List<String> read() throws IOException {
		br = new BufferedReader(fr = new FileReader(fromFileName));
		List<String> list = new ArrayList<String>();
		String string = null;
		while ((string = br.readLine()) != null) {
			list.add(string);
		}
		br.close();
		return list;
	}

	public int numberOfLines() throws IOException {
		return read().size();
	}

	public String longestLine() throws IOException {
		String line = "";
		for (String string : read()) {
			if (string.length() > line.length()) {
				line = string;
			}
		}
		return line;
	}

	public String coinsidence(String word) throws IOException {
		String sentence = null;
		String line = "";
		Pattern p = Pattern.compile(word);
		Matcher m;
		for (String string : read()) {
			m = p.matcher(string);
			if (m.find()) {
				sentence = string;
				break;
			}
		}
		if (sentence != null) {
			String[] arr = sentence.split(word);
			line = arr[arr.length - 1];
		}
		return line;
	}

	public void append(String line) throws IOException {
		bw = new BufferedWriter(fw = new FileWriter(toFileName, true));
		bw.append(line);
		bw.newLine();
		bw.close();
	}

	public void appendAfterWord(String word) throws IOException {
		append(coinsidence(word));
	}

	public void start() {
		try {
			append("Number of line in " + fromFileName + " : "
					+ numberOfLines() + "\n");
			append("The longest line in " + fromFileName + " : ");
			append(longestLine());
			append("Name:");
			appendAfterWord("Name:");
			append("Birthday:");
			appendAfterWord("Birthday:");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void close() {
		try {
			if (bw != null) {
				bw.close();
			}
			if (br != null) {
				br.close();
			}
			if (fr != null) {
				fr.close();
			}
			if (fw != null) {
				fw.close();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
