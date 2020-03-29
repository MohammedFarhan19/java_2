package myJava1;

public class ZahlRaten {
	
	public static void main(String[] args) {
		
		int numberToGuess= (int) (Math.random() * 5 + 1);
		
		int guess;
		
		do {
			
			System.out.println("geben Sie eine Zhal zwischen 1 und  5");
			
			guess=new java.util.Scanner(System.in).nextInt();
			
			if(guess == numberToGuess)
				System.out.println("Super ...!");
			else if(numberToGuess > guess)
				System.out.println("Nee, meine zahl ist größer");
			else
				System.out.println("Nee, meine Zahl ist kleiner");
			
		} while (guess != numberToGuess);
	}

}
