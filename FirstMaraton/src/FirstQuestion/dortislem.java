package FirstQuestion;
import java.util.Scanner;
	
public class dortislem {
		public void menu() {

		char operator;
		Double number1, number2, result;


		Scanner input = new Scanner(System.in);


		System.out.println("��lem t�r�n� se�iniz: +, -, *, /");
		operator = input.next().charAt(0);


		System.out.println("��lem yapmak istedi�iniz birinci numaray� giriniz");
		number1 = input.nextDouble();

		System.out.println("��lem yapmak istedi�iniz ikinci numaray� giriniz");
		number2 = input.nextDouble();

		do {
		switch (operator) {

  
		case '+':
				result = number1 + number2;
				System.out.println(number1 + " + " + number2 + " = " + result);
		break;

 
		case '-':
				result = number1 - number2;
				System.out.println(number1 + " - " + number2 + " = " + result);
		break;


		case '*':
				result = number1 * number2;
				System.out.println(number1 + " * " + number2 + " = " + result);
    	break;

		case '/':
				result = number1 / number2;
				System.out.println(number1 + " / " + number2 + " = " + result);
    	break;

		default:
				System.out.println("Yanl�� Se�im");
		break;
			}
			}	while (operator != 0);

			input.close();
		}
}