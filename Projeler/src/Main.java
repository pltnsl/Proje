
public class Main {

	public static void main(String[] args) {
		//bug ssitemsel hata, açıklara
		//Asal Sayı Var mı?
		int number = 13;
		//kalan operatörü
		int remainder = number % 2;
		System.out.println(remainder);
		//isprime= asal mı
		boolean isPrime = true;
		if(number==1) {
			System.out.println("Sayı asal değildir.");
			return;
		}
		if(number<1) {
			System.out.println("Geçersiz Sayı");
		}
		
		for (int i=2; i<number;i++) {
			if(number %i==0) {
				isPrime =false;
				
			}
			
		}
		if(isPrime) {
			System.out.println("Sayı asaldır.");
		}else {
			System.out.println("Sayı asal değildir.");
		}
		//proje2 Kalın ses ince ses
		
		 char harf ='E';
		 switch(harf) {
		 case 'A':
		 case 'I':
		 case 'O':
		 case 'U':
			 System.out.println("Kalın sesli harf");
			 break;
			 default:
				 System.out.println("İnce sesli harf");
		 }
		 //proje3 mükemmel sayı
		 //6---> 1,2,3 topla 6
		 
		 int number1 = 6;
		 int total=0;
		 
		 for(int i1=1;i1<number1;i1++) {
			 if (number1 % i1==0) {
				 total = total + i1; 
			 }
		 }
		 
		 if (total==number1) {
			 System.out.println("Mükemmel Sayıdır.");
		 }else {
			 System.out.println("Mükemmel Sayı Değildir");
		 }
		 
		 //Arkadaş Sayılar 
		 //220-284 kendi hari poz. tamsayı bölenleri birbirine eşitse
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
			 System.out.println("Bu iki sayı arkadaştır.");
		 }else {
			System.out.println("Bu iki sayı arkadaş değildir."); 
			
		 }
		 
		 //sayı Bulma
		 
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
			  System.out.println("Sayı Mevcuttur.");
		  }else {
			  System.out.println("Sayı mevcut değildir.");
		  }
		  
		 
		

	}

}
