package ThirdQuestion;

import java.util.Scanner;

public class CustomString {
	
	private static final Scanner YaziGir = null;


	public static void main(String[] args) {
		
		Degiskenler degistir = new Degiskenler();
		degistir.Uzunluk();
		degistir.BuyukHarf();
		degistir.KucukHarf();
		degistir.BasindaVeSonundaBoslukOlmasin();
		degistir.NeileBitiyor(YaziGir);
		degistir.NeileBasliyor(YaziGir); //buralara de�er girebiliriz.
		degistir.IndisNumarasindanSonraYaz(); //substring(5,8) ile yaz�lm��t�r --> i s verir
		degistir.BuyukKucukHarfOnemseme(); //equalsIgnoreCase("ikinci soru"); sorulmu�tur --> false
		degistir.MetinUzerindeVarmi(); //Dizi.contains("kinci"); sorulmu�tur --> true
		degistir.KarsilastirmaYap(); //.equals("ikinci soru"); sorulmu�tur --> false
	}
	
}

