
public class Main {
	// this is where you can put in the filepath to the specific files that youi want to test out for the reverser
	public static void main(String[] args) {
		Reverser<String> strReverser = new Reverser<String>();
		strReverser.FTStck(//put txt file path link here);
		strReverser.StckTF(//put txt file path link here);
		
		Reverser<Float> fltReverser = new Reverser<Float>();
		fltReverser.FTStck(//put txt file path link here);
		fltReverser.StckTF(//put txt file path link here);
	}

}
