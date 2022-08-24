import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

// Using a stack is very useful here so we can use push and pop to help with reversing contents of a file
public class Reverser<E> {
	private Stack<E> stck;

	public Reverser() {
		// we are creating a new stack here to read the contents of a given file 
		stck = new Stack<E>();
	}
	// file to stack, reading everything in the file, and turning each charater into a stack, a part of an array which can be used later for reversing it
	public void FToStck(String filename) {
		try {
			File file = new File(filename);
			BufferedReader br = new BufferedReader(new FileReader(file));

			String lineRead;
			while ((lineRead = br.readLine()) != null) {
				lineRead = lineRead.replaceAll("\uFFFD", "\"");
				// push means it ios where the contents of the file are being added to the stack
				stck.push((E) lineRead);
			} // can catch errors if file is not compatible and making sure it is readble for the comoputer. Try and catch error bound expections are thrown to make sure the code works. 
		} catch (FileNotFoundException e) {
			System.out.println("Error when accessing file! ");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void StckToF(String outputFile) {
		try {
			PrintWriter myFileOut = new PrintWriter(outputFile);
			while(!stck.isEmpty()) {
				//pop is where all the contents from the stack are being pushed out charater by charater in revserve order. 
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
