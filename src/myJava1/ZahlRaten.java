package myJava1;

public class ZahlRaten {

	public static void main(String[] args) {

//		int numberToGuess= (int) (Math.random() * 5 + 1);
//		
//		int guess;
//		
//		do {
//			
//			System.out.println("geben Sie eine Zhal zwischen 1 und  5");
//			
//			guess=new java.util.Scanner(System.in).nextInt();
//			
//			if(guess == numberToGuess)
//				System.out.println("Super ...!");
//			else if(numberToGuess > guess)
//				System.out.println("Nee, meine zahl ist gr��er");
//			else
//				System.out.println("Nee, meine Zahl ist kleiner");
//			
//		} while (guess != numberToGuess);

//		wir benutzen hier die for Schleife 

//		for (int row = 1; row <= 10; row++) {
//			for (int col = 1; col <= row; col++)
//			{
//				System.out.print("*");
//			}
//			
//			System.out.println();
//		}
		
//		another for
		for(int i =1 , j = 9; i<=j; i++, j--)
			System.out.printf("%d  * %d = %d%n",i,j,i*j);
	}

}
