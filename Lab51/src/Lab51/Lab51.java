package Lab51;

import java.util.Scanner;

public class Lab51 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a,b,c,d,e,f,k=1;
		double x,t,y,u,h;
		int count=0;
		String[]konu = {"eğitim","sağlık","politika","ekonomi","askeri"};
		int [][] puan = new int[5][10];
		while (k==1) {
			System.out.println("-------------------------------------------------------");
			System.out.println("1)Ankete katıl    2)Anketi sonuçla");
			a = input.nextInt();
			int egitpuan=0,sagpuan=0,polpuan=0,ekopuan=0,askepuan=0;
			switch(a) {
			case 1:
				count++;
				System.out.println("--Gösterilen konulara 1-10 arasında degerler verin--");
				System.out.println("eğitim");
				b = input.nextInt();
				puan[0][b-1]++;
				System.out.println("sağlık");
				c = input.nextInt();
				puan[1][c-1]++;
				System.out.println("politika");
				d = input.nextInt();
				puan[2][d-1]++;
				System.out.println("ekonomi");
				f = input.nextInt();
				puan[3][f-1]++;
				System.out.println("askeri");
				e = input.nextInt();
				puan[4][e-1]++;
				break;
			case 2:
				for(int i =0; i<10;i++) {
					egitpuan +=puan[0][i]*(i+1);
					x = (double)egitpuan/count;
					sagpuan +=puan[1][i]*(i+1);
					t =(double) sagpuan/count;
					polpuan +=puan[2][i]*(i+1);
					y = (double)polpuan/count;
					ekopuan +=puan[3][i]*(i+1);
					u =(double) ekopuan/count;
					askepuan +=puan[4][i]*(i+1);
					h =(double) askepuan/count;
					if(i>8) {
						System.out.println("katılan kişi: "+count);
						System.out.println("-------------------------------------------------------");
						System.out.println("        |"+"1"+"|"+"2"+"|"+"3"+"|"+"4"+"|"+"5"+"|"+"6"+"|"+"7"+"|"+"8"+"|"+"9"+"|"+"10"+"|t.puan|ortalama");
						System.out.printf("egitim  ");
						for(int m = 0; m < 10; m++) {
							System.out.printf("|%d",puan[0][m]);
						}
						System.out.printf("|  %d |  %.2f%n",egitpuan,x);
						
						System.out.printf("sağlık  ");	
						for(int m = 0; m < 10; m++) {
							System.out.printf("|%d",puan[1][m]);
							
						}
						System.out.printf("|  %d |  %.2f%n",sagpuan,t);
						
						System.out.printf("politika");	
						for(int m = 0; m < 10; m++) {
							System.out.printf("|%d",puan[2][m]);
							
						}
						System.out.printf("|  %d |  %.2f%n",polpuan,y);
						
						System.out.printf("ekonomi ");	
						for(int m = 0; m < 10; m++) {
							System.out.printf("|%d",puan[3][m]);
							
						}
						System.out.printf("|  %d |  %.2f%n",ekopuan,u);
						
						System.out.printf("askeri  ");	
						for(int m = 0; m < 10; m++) {
							System.out.printf("|%d",puan[4][m]);
							
						}
						System.out.printf("|  %d |  %.2f%n",askepuan,h);
						
						System.out.println("-------------------------------------------------------");
						
						if(egitpuan == sagpuan && sagpuan== polpuan && polpuan== ekopuan && ekopuan == askepuan)
							System.out.println("konular eşit önemlikte");
						else {
							if(egitpuan>sagpuan && egitpuan>polpuan && egitpuan>ekopuan && egitpuan>askepuan)
								System.out.println("En önemli Konu: Eğitim ");
							else if( sagpuan>polpuan && sagpuan>ekopuan && sagpuan>askepuan)
								System.out.println("En önemli Konu: Sağlık ");
							else if( polpuan>ekopuan && polpuan>askepuan)
								System.out.println("En önemli Konu: Politika ");
							else if( ekopuan>askepuan)
								System.out.println("En önemli Konu: Ekonomi ");
							else
								System.out.println("En önemli konu: Askeri ");
						
						
							if(egitpuan<sagpuan && egitpuan<polpuan && egitpuan<ekopuan && egitpuan<askepuan)
								System.out.println("En az önemli Konu: Eğitim");
							else if( sagpuan<polpuan && sagpuan<ekopuan && sagpuan<askepuan)
								System.out.println("En az önemli Konu: Sağlık");
							else if( polpuan<ekopuan && polpuan<askepuan)
								System.out.println("En önemli Konu: Politika");
							else if( ekopuan<askepuan)
								System.out.println("En az önemli Konu: Ekonomi");
							else
								System.out.println("En az önemli konu: Askeri");
						}
					}
					
				}
				break;
				
			}
			
		}
		

	}

}
