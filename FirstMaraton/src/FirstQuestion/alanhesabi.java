package FirstQuestion;
import java.util.Scanner;
public class alanhesabi {
	public void alan() {

		
		
		Scanner gir = new Scanner(System.in);
		
		
		System.out.println("Dairenin çapýný giriniz: ");
		double cap = gir.nextDouble();
		System.out.println("Dikdörtgenin uzunluðunu giriniz:");
		double uzunluk = gir.nextDouble();
		System.out.println("Dikdörtgenin geniþliðini giriniz:");
		double genislik = gir.nextDouble();
		System.out.println("üçgenin yüksekliðini giriniz:");
		double yukseklik = gir.nextDouble();
		System.out.println("üçgenin tabanýný giriniz:");
		double taban = gir.nextDouble();
		
		System.err.println("Daire alaný =" + DaireAlani(cap));
		System.err.println("Dikdörtgen alaný =" + KareAlani(uzunluk, genislik));
		System.err.println("Üçgenin alaný = " + UcgenAlani(yukseklik, taban));
		
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
