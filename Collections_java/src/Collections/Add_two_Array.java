package Collections;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

public class Add_two_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> l = new ArrayList<String>();
		l.add("Hai");
		l.add("Welcome");
		l.add("Face");
		ArrayList<String> l1 = new ArrayList<String>();
		l1.add("Friends");
		l1.add("Home");
		l1.add("Good");
		l.addAll(l1);// Add all elements of l1 to l
		Iterator itr = l.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
