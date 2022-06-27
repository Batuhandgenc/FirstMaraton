package FirstQuestion;
import java.util.Scanner;
public class secim {
	
		public void MenuSec() {

		char operator;
		


		Scanner input = new Scanner(System.in);


		System.out.println("Alan hesabý mý yapmak istersiniz dört iþlem mi?");
		System.out.println("Alan hesabý için 1");
		System.out.println("Dört iþlem için 2 giriniz");
		
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
	    System.out.println("Yanlýþ seçim");
	    break;
	}
		} while (operator != 0);

	input.close();
}
}
	