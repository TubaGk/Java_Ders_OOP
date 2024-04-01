package Ders4;

public class ders43 {

	public static void main(String[] args) {
		int[] dizi = {1,1,1,1,1,2,2,3,2,2,3,3,3,3,3,4,4,4,1,4,5,5,5,5,5};
		int b=0;
		int a=0;
		int c=0;
		int d=0;
		int e=0;
		for (int counter=0; counter<dizi.length; counter++) {
			if (dizi[counter]==1)
				a++;
			else if (dizi[counter]==2)
				b++;
			else if (dizi[counter]==3)
				c++;
			else if (dizi[counter]==4)
				d++;
			else if(dizi[counter]==5)
				e++;
		}
		System.out.printf("1:%d%n2:%d%n3:%d%n4:%d%n5:%d%n",a,b,c,d,e);
	}

}
