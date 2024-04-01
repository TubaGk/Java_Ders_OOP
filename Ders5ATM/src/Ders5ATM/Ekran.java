package Ders5ATM;

import java.util.ArrayList;
import java.util.Scanner;

public class Ekran {

	public static void main(String[] args) {
		person p1 = new person("Tuba",1234,100);
		person p2 = new person("Sude",1235,200);
		person p3 = new person("Zeze",1236,300);
		person p4 = new person("Betu",1237,400);
		person p5 = new person("Veli",1238,500);
		
		ArrayList<person> arr = new ArrayList<person>();
		arr.add(p1);
		arr.add(p2);
		arr.add(p3);
		arr.add(p4);
		arr.add(p5);
		
		Scanner input1 = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		
		int count=0;
		String name;
		Integer sif,islem,a,b,c,f,e;
		int y=1;
		while(y==1) {
		int t=1;
		System.out.println("isim giriniz: ");
		name = input1.next();
		System.out.println("Sifre giriniz: ");
		sif = input2.nextInt();
		
		for(int i = 0; i<5;i++) {
			if(name.equals(arr.get(i).adi) && sif.equals(arr.get(i).sifre)) {
				while(t==1) {
				System.out.println(" ");
				System.out.println("Yapılacak Islemi Seciniz:");
				System.out.println("1)para yatır,2)para çek,3)bakiye sorgula,4)çıkış");
				islem = input2.nextInt();
				switch(islem) {
				case 1: 
					System.out.println("yatircaginiz miktar girin:");
					a = input2.nextInt();
					f = arr.get(i).bakiye +a;
					System.out.println(arr.get(i).bakiye+"+"+a+"="+f);
					arr.get(i).bakiye = arr.get(i).bakiye+a;
					break;
				case 2: 
					System.out.println("Cekiceginiz miktar girin:");
					b = input2.nextInt();
					e = arr.get(i).bakiye -b;
					System.out.printf(arr.get(i).bakiye+"-"+b+"="+e);
					arr.get(i).bakiye = arr.get(i).bakiye-b;
					break;
				case 3: 
					System.out.println("Bakiyeniz:"+arr.get(i).bakiye);
					break;
				case 4:
					t = 0;
					System.out.println("çıkış");
					break;
				
						}
					}
				}
			else if(i>3){ {
					count++;
					System.out.println("yanlış giriş");
					if (count ==3)
						System.out.println("Üç defa yanlış giriş yaptınız");
					}
				}
			}
		}	
	}

}
