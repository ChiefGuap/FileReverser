import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Reverser<E> {
	private Stack<E> stck;

	public Reverser() {
		stck = new Stack<E>();
	}

	public void FileToStack(String filename) {
		try {
			File file = new File(filename);
			BufferedReader br = new BufferedReader(new FileReader(file));

			String lineRead;
			while ((lineRead = br.readLine()) != null) {
				lineRead = lineRead.replaceAll("\uFFFD", "\"");
				stck.push((E) lineRead);
			}
		} catch (FileNotFoundException e) {
			System.out.println("Error accessing the file! ");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void StackToFile(String outputFile) {
		try {
			PrintWriter myFileOut = new PrintWriter(outputFile);
			while(!stck.isEmpty()) {
				myFileOut.println(stck.pop());
			}
			myFileOut.close();
		} catch (FileNotFoundException e) {
			System.out.println("Error writing to file! ");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
