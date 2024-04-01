package Ders5;

import java.util.HashMap;

public class Mapler {

	public static void main(String[] args) {
		HashMap<String,Integer> m = new HashMap<String,Integer>();
		m.put("Ahmet",1234);
		m.put("Mehemt",5678);
		m.put("Ali",1111);
		for ( String i:m.keySet()) {
			System.out.println("Key: "+i+"--"+"Value: "+m.get(i));
		}

	}

}
