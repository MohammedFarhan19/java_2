package myJava1;

public class MyKlassSwitch {
	
   public static void main(String [] args) {
		
//		This is a simple calculator using Switch
		
		System.out.println("Bitte geben Sie die erste Zahl!");
		
		double num1=new java.util.Scanner(System.in).nextDouble();
		
		System.out.println("Bitte geben Sie die zweite Zahl!");
		
		double num2=new java.util.Scanner(System.in).nextDouble();
		
		System.out.println("Und nun geben Sie die etsprechende Operation (+,-,X,/)");
		
		char operator=new java.util.Scanner(System.in).nextLine().charAt(0);
		
		switch (operator) {
		
		case '+':
			System.out.printf("Das Ergebnis von %s  %s  %s= %s",num1,operator,num2,num1+num2);
			
			break;
		case '-':
			System.out.printf("Das Ergebnis von %s  %s  %s= %s",num1,operator,num2,num1-num2);
			break;
		case '*':
			System.out.printf("Das Ergebnis von %s  %s  %s= %s",num1,operator,num2,num1*num2);
			
			break;
		case '/':
			System.out.printf("Das Ergebnis von %s  %s  %s= %s",num1,operator,num2,num1/num2);
			break;
		default:
			System.out.printf("Die Operation %s ist ungültig, Bitte Vesruchen Sie erneut!",operator);
			break;
		}
		
		
		
	}

}



