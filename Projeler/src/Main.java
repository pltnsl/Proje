
public class Main {

	public static void main(String[] args) {
		//bug ssitemsel hata, a��klara
		//Asal Say� Var m�?
		int number = 13;
		//kalan operat�r�
		int remainder = number % 2;
		System.out.println(remainder);
		//isprime= asal m�
		boolean isPrime = true;
		if(number==1) {
			System.out.println("Say� asal de�ildir.");
			return;
		}
		if(number<1) {
			System.out.println("Ge�ersiz Say�");
		}
		
		for (int i=2; i<number;i++) {
			if(number %i==0) {
				isPrime =false;
				
			}
			
		}
		if(isPrime) {
			System.out.println("Say� asald�r.");
		}else {
			System.out.println("Say� asal de�ildir.");
		}
		//proje2 Kal�n ses ince ses
		
		 char harf ='E';
		 switch(harf) {
		 case 'A':
		 case 'I':
		 case 'O':
		 case 'U':
			 System.out.println("Kal�n sesli harf");
			 break;
			 default:
				 System.out.println("�nce sesli harf");
		 }
		 //proje3 m�kemmel say�
		 //6---> 1,2,3 topla 6
		 
		 int number1 = 6;
		 int total=0;
		 
		 for(int i1=1;i1<number1;i1++) {
			 if (number1 % i1==0) {
				 total = total + i1; 
			 }
		 }
		 
		 if (total==number1) {
			 System.out.println("M�kemmel Say�d�r.");
		 }else {
			 System.out.println("M�kemmel Say� De�ildir");
		 }
		 
		 //Arkada� Say�lar 
		 //220-284 kendi hari poz. tamsay� b�lenleri birbirine e�itse
		 int sayi1=220;
		 int sayi2=284;
		 int toplam1=0;
		 int toplam2=0;
		 
		 for(int i=1;i<sayi1;i++) {
			 if(sayi1%i==0) {
				 toplam1 = toplam1+i;
			 }
		 }
		 for(int i=1;i<sayi2;i++) {
			 if(sayi2%i==0) {
				 toplam2 = toplam2+i;
			 }
		 }
		 if(sayi1==toplam2 && sayi2 == toplam1) {
			 System.out.println("Bu iki say� arkada�t�r.");
		 }else {
			System.out.println("Bu iki say� arkada� de�ildir."); 
			
		 }
		 
		 //say� Bulma
		 
		  int[] sayilar = new int [] {1,2,3,4,5};
		  int aranacak = 5;
		  boolean varMi =false;
		  
		  for(int sayi: sayilar) {
			  if(sayi==aranacak) {
				  varMi = true;
				  break;
			  }
		  }
		  
		  if(varMi) {
			  System.out.println("Say� Mevcuttur.");
		  }else {
			  System.out.println("Say� mevcut de�ildir.");
		  }
		  
		 
		

	}

}
