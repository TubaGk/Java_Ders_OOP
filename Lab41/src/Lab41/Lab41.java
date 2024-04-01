package Lab41;

import java.util.Scanner;

public class Lab41 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	
		int[] dizi = {1,2,3,3,1};
		int[] cevap = new int[5] ;
		int counter=0;
		System.out.println("->Hangi ülke en çok sera gazı yaymaktadır");
		System.out.println("1:Çin  2:Hindistan  3:Amerika  4:japonya");
		System.out.println("->Hangi Gezegenin Atmosferi Küresrel Isınma ile yok olmaktadır");
		System.out.println("1:JÜPİTER 2:VENÜS  3:MARS  4:MERKÜR");
		System.out.println("->İklim Degişikliği Nedeniyele Yılda kaç insan ölmektedir");
		System.out.println("1:1500  2:100.000  3:150.000  4:500.000");
		System.out.println("->Küresel ısınmaya karşı en savunmasız hayvan hangisisdir");
		System.out.println("1:KAR LEOPARI  2:KUTUP AYISI  3:DENİZ GERGEDANI  4:TUKAN ");
		System.out.println("->kirlilik havaya yayıldıkça ne azalır");
		System.out.println("1:ozon tabakası  2:Okyonuslar  3:Yağmur ormanları  4:Karbondioksit");
		for (int i=0; i<5; i++) {
			System.out.println(i+1+"soru= ");
			cevap[i] = input.nextInt();	
		}
		for (int i=0; i<dizi.length; i++) {
			if(dizi[i]==cevap[i])
				counter++;
		}
		System.out.println(counter +" doğru sayınız");
		if (counter == 5)
			System.out.printf("MÜKEMMEL");
		else if(counter == 4)
			System.out.printf("ÇOK İYİ");
		else 
			System.out.printf("ÇALIŞMANIZ LAZIM");

	}

}
