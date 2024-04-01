package Ders5;

import java.util.LinkedList;

public class Linkedliste {

	public static void main(String[] args) {
		LinkedList<String> arr = new LinkedList<String>();
		arr.add("Mercedes");
		arr.add("Volvo");
		arr.add("BMW");
		arr.add(0,"Ford");
		System.out.println(arr.get(0).hashCode());
		System.out.println(arr.get(1).hashCode());
		System.out.println("Arac Markaları: ");
		for(String i:arr) {
			System.out.print(i+" ");
		}

	}

}
