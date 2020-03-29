package myJava1;

public class KlassShaltJahr {
	
	public static void main(String [] args) {
		
//	hier werden die Tagen eines Jahres vorrausgesagt 
		
//		Monateingabe
		System.out.println("Bitt geben Sie eine Zhal zwische 1 und 12");
		
		int monat=new java.util.Scanner(System.in).nextInt();
		
		System.out.println("Bitte geben Sie das jahr ein viestellig \"XXXX\"");
		
		int jahr=new java.util.Scanner(System.in).nextInt();
		
		boolean istScahltJahr=((jahr % 4 == 0 && jahr % 100 !=0)) || (jahr % 400 == 0);
		
		switch (monat) {
//		Fall-through
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30 Tage");
			break;
		case 1:  // Fall-through
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31 Tage");
			break;
		case 2:
			if(istScahltJahr)
				System.out.println("29 Tage");
			else
				System.out.println("28 tage");
			break;
		default:
			System.err.println("ungültiger Monat");
			break;
		}
		
		
	}

}
