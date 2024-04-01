package Ders5;

import java.util.ArrayList;
//import java.util.Collections;

public class obje {

	public static void main(String[] args) {
		 /*ArrayList<Object> arr =new ArrayList<Object>();
		 arr.add("Ahmet");
		 arr.add(15);
		 arr.add(6.5D);
		 
		 for (int i=0; i<arr.size();i++) {
			 System.out.print(arr.get(i)+" ");
		 }
		 arr.add(1,"Mehmet");
		 Collections.shuffle(arr);   //dizi içeriğini karıştırıyor
		
		 for (int i=0; i<arr.size();i++) {
			 System.out.print(arr.get(i)+" ");
		 }*/
		person p1 = new person("Ahmet",20);
		person p2 = new person("Mehmet",25);
		person p3 = new person("Ali",30);
		ArrayList<person> arr1 = new ArrayList<person>();
		arr1.add(p1);
		arr1.add(p2);
		arr1.add(p3);
		//System.out.println(arr1.get(0).yas);
		//System.out.println(arr1.get(2).adi);
		
		for(int i = 0; i < arr1.size(); i++) {
			System.out.println(arr1.get(i).adi);
			System.out.println(arr1.get(i).yas);
		}

	}

}
