
import java.util.ArrayList;
import java.util.Random;


public class MasterMind {
	public static void main(String [] args) {
		System.out.println("Welkom");
		
		Code deCode = new Code();
		char [] teraden = new char [5];
		
		for( int i = 0; i < teraden.length; i++) {
			Code L1 = new Code();
			L1.RandomLetter();
			System.out.println(L1.deChar);
			teraden[i] = L1.deChar;
			
			
		}
		System.out.println("=================");
		for(int x = 0; x < teraden.length ; x++) {
			System.out.println(".."+teraden[x]);
		}

	
	}
}
class Code{
	
	char deChar;
	
	void RandomLetter(){
		char[] LetterKeuze = {'a','b','c','d','e','f'};
		
		Random schudden = new Random();
		int geschud = schudden.nextInt(5);
		int i = geschud;
		
		deChar = LetterKeuze[i];
		
	}

}




