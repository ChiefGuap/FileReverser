
public class Main {

	public static void main(String[] args) {
		Reverser<String> strReverser = new Reverser<String>();
		strReverser.FileToStack("/Users/tahaaziz/Downloads/reversePoem.txt");
		strReverser.StackToFile("/Users/tahaaziz/Downloads/reversedPoem.txt");
		
		Reverser<Float> fltReverser = new Reverser<Float>();
		fltReverser.FileToStack("/Users/tahaaziz/Downloads/reverseSpells.txt");
		fltReverser.StackToFile("/Users/tahaaziz/Downloads/reversedSpells.txt");
	}

}
