package SecondQuestion;

import java.util.ArrayList;
import java.util.Scanner;
		public class DiziMenusu {
		public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		
		int input;

			do {
				System.out.println("****Uygulama Giri� Ekran�****");
				System.out.println("--------------------------------------");
				System.out.println("1-Diziye Eleman ekle ");
				System.out.println("2-Diziden Eleman Sil");
				System.out.println("3-Dizi Aras�na Eleman Ekle");
				System.out.println("4-Diziyi Listele");
				System.out.println("5-Dizideki en b�y�k rakam� g�ster");
				System.out.println("6-��k��");
				System.out.println();
				System.out.print("L�tfen Bir ��lem Se�iniz :");
				System.out.println();
				input = scanner.nextInt();
				scanner.nextLine();
				Scanner klavye=new Scanner(System.in);
				switch (input) {
				
				case 1:
					   System.out.println("Dizi Ne kadar bir uzunluktan olu�acak? ");
				        int n=klavye.nextInt();
				        System.out.println("Dizide olmas�n� istedi�iniz rakamlar� girin");
				        ArrayList <String> malzemeler=new ArrayList<String>();      
				        
				        for(int i=0;i<n;i++){
				            malzemeler.add(klavye.next());      
				        }
					break;
				
				case 2:
					
						System.out.println("Dizideki Ka��nc� Eleman� Silmek �stiyorsunuz ?");
						int sil=klavye.nextInt();               						
						malzemeler.remove(sil-1);			        
				        System.out.println("Listenin "+sil+(". Eleman� Silindi"));
					
					break;

				case 3:
					 System.out.println("Dizinin Son Hali: ");
				     for(int j=0;j<malzemeler.size();j++){
				      System.out.println(malzemeler.get(j)); }
					 break;
				
				case 4:
				
				
				case 5:
				
					System.out.println("Dizideki En b�y�k numaray� bulunuz");
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