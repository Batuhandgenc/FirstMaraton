package FirstQuestion;
import java.util.Scanner;
public class secim {
	
		public void MenuSec() {

		char operator;
		


		Scanner input = new Scanner(System.in);


		System.out.println("Alan hesab� m� yapmak istersiniz d�rt i�lem mi?");
		System.out.println("Alan hesab� i�in 1");
		System.out.println("D�rt i�lem i�in 2 giriniz");
		
		operator = input.next().charAt(0);
		
		do {
		switch (operator) {

	  
		case '1':

			alanhesabi alanhesabi = new alanhesabi();
			alanhesabi.alan();
	    break;


		case '2':

			dortislem dortislem = new dortislem();
			dortislem.menu();
	    break;


		default:
	    System.out.println("Yanl�� se�im");
	    break;
	}
		} while (operator != 0);

	input.close();
}
}
	