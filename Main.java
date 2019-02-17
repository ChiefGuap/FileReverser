
public class Main {

	public static void main(String[] args) {
		Reverser<String> strReverser = new Reverser<String>();
		strReverser.FileToStack(//put txt file path link here);
		strReverser.StackToFile(//put txt file path link here);
		
		Reverser<Float> fltReverser = new Reverser<Float>();
		fltReverser.FileToStack(//put txt file path link here);
		fltReverser.StackToFile(//put txt file path link here);
	}

}
