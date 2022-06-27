package SecondQuestion;
import ThirdQuestion.Degiskenler;

		public class OrjinalDizi {
		public int[] dizi;
		public OrjinalDizi(){
			dizi = new int[0];
	}
		public OrjinalDizi(int[] dizi)
			{
			this.dizi = dizi;
	}
		public void EklemeYap(int sayi){
			int[] YeniDizi = new int[dizi.length+1];
			for(int i = 0; i < dizi.length; i++){
					YeniDizi[i] = dizi[i];
					YeniDizi[dizi.length] = sayi;
       }
			dizi = YeniDizi;
	}
	
		public void EklemeYap(int sayi, int indeks) {
				int[] YeniDizi = new int[dizi.length+1];
				for(int i = 0; i < indeks; i++){
            YeniDizi[i] = dizi[i];
        }
        YeniDizi[indeks] = sayi;
        	for(int i = indeks; i < dizi.length; i++){
            YeniDizi[i+1] = dizi[i];
        }
        	dizi = YeniDizi;
    	}
    		public int[] Listele(){
    			return dizi;
        
        
    	}
    	public void Sil(int indeks){
    		int[] YeniDizi = new int[dizi.length-1];
    		for(int i = 0; i < indeks; i++){
    			YeniDizi[i] = dizi[i];
	}
		if(indeks < dizi.length-1)
    {
        for(int i = indeks; i < YeniDizi.length; i++ ){
            YeniDizi[i] = dizi[i+1];
       }
    }
    	dizi = YeniDizi;
}


}



