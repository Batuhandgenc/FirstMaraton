package SecondQuestion;

import java.util.ArrayList;
import java.util.Scanner;
		public class DiziMenusu {
		public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		
		int input;

			do {
				System.out.println("****Uygulama Giriþ Ekraný****");
				System.out.println("--------------------------------------");
				System.out.println("1-Diziye Eleman ekle ");
				System.out.println("2-Diziden Eleman Sil");
				System.out.println("3-Dizi Arasýna Eleman Ekle");
				System.out.println("4-Diziyi Listele");
				System.out.println("5-Dizideki en büyük rakamý göster");
				System.out.println("6-Çýkýþ");
				System.out.println();
				System.out.print("Lütfen Bir Ýþlem Seçiniz :");
				System.out.println();
				input = scanner.nextInt();
				scanner.nextLine();
				Scanner klavye=new Scanner(System.in);
				switch (input) {
				
				case 1:
					   System.out.println("Dizi Ne kadar bir uzunluktan oluþacak? ");
				        int n=klavye.nextInt();
				        System.out.println("Dizide olmasýný istediðiniz rakamlarý girin");
				        ArrayList <String> malzemeler=new ArrayList<String>();      
				        
				        for(int i=0;i<n;i++){
				            malzemeler.add(klavye.next());      
				        }
					break;
				
				case 2:
					
					
					
					break;

				case 3:
				
				case 4:
				
				
				case 5:
				
				
					break;				
				
				case 6:
					System.exit(0);					
				
				default:
					break;
				}

				} while (input != 0);

		}	



	
}