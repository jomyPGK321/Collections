package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Array_Clear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		ArrayList l = new ArrayList();
		System.out.println("Enter the Size of the Array");
		int n = s.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the name");
			String a = s.next();
			System.out.println("Enter the age");
			int b = s.nextInt();
			l.add(a);
			l.add(b);
		}
		l.clear();
		Iterator itr = l.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
