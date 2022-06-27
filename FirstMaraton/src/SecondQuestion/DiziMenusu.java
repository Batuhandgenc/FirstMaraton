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
					
						System.out.println("Dizideki Kaçýncý Elemaný Silmek Ýstiyorsunuz ?");
						int sil=klavye.nextInt();               						
						malzemeler.remove(sil-1);			        
				        System.out.println("Listenin "+sil+(". Elemaný Silindi"));
					
					break;

				case 3:
					 System.out.println("Dizinin Son Hali: ");
				     for(int j=0;j<malzemeler.size();j++){
				      System.out.println(malzemeler.get(j)); }
					 break;
				
				case 4:
				
				
				case 5:
				
					System.out.println("Dizideki En büyük numarayý bulunuz");
					int max=0;
					for( int i=0;i<l;i++) 
					{
						if ((Integer) a.get(i)>max) 
						{
							max=(Integer) a.get(i);
						}
					}
					}
					return max;
					break;				
				
				case 6:
					System.exit(0);					
				
				default:
					break;
				}

				} while (input != 0);

		}	



	
}