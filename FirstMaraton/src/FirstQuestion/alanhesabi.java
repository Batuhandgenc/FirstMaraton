package FirstQuestion;
import java.util.Scanner;
public class alanhesabi {
	public void alan() {

		
		
		Scanner gir = new Scanner(System.in);
		
		
		System.out.println("Dairenin �ap�n� giriniz: ");
		double cap = gir.nextDouble();
		System.out.println("Dikd�rtgenin uzunlu�unu giriniz:");
		double uzunluk = gir.nextDouble();
		System.out.println("Dikd�rtgenin geni�li�ini giriniz:");
		double genislik = gir.nextDouble();
		System.out.println("��genin y�ksekli�ini giriniz:");
		double yukseklik = gir.nextDouble();
		System.out.println("��genin taban�n� giriniz:");
		double taban = gir.nextDouble();
		
		System.err.println("Daire alan� =" + DaireAlani(cap));
		System.err.println("Dikd�rtgen alan� =" + KareAlani(uzunluk, genislik));
		System.err.println("��genin alan� = " + UcgenAlani(yukseklik, taban));
		
		}

		public static double DaireAlani(double cap) {
		return 3.142*cap*cap;
		}
		public static double UcgenAlani (double yukseklik, double taban) {
		return taban*yukseklik/2;
		}
		
		public static double KareAlani(double uzunluk, double genislik) {
		return uzunluk*genislik;
		}
		
}
