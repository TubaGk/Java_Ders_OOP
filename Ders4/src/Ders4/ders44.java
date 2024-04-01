package Ders4;

import java.util.ArrayList;

public class ders44 {

	public static void main(String[] args) {
		ArrayList<String> items =new ArrayList<String>();
		items.add("pink");
		items.add(0,"red");
		items.add(1,"yellow");
		items.add(3,"purple");
		items.add(4,"green");
		
		System.out.printf("Display list contents with counter-controlled loop:");
		
		for (int i=0;i<items.size();i++) {
			System.out.printf("%s%n",items.get(i));
		}

	}

}
