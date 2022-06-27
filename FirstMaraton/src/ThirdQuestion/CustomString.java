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
		degistir.NeileBasliyor(YaziGir); //buralara değer girebiliriz.
		degistir.IndisNumarasindanSonraYaz(); //substring(5,8) ile yazılmıştır --> i s verir
		degistir.BuyukKucukHarfOnemseme(); //equalsIgnoreCase("ikinci soru"); sorulmuştur --> false
		degistir.MetinUzerindeVarmi(); //Dizi.contains("kinci"); sorulmuştur --> true
		degistir.KarsilastirmaYap(); //.equals("ikinci soru"); sorulmuştur --> false
	}
	
}

