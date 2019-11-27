package Collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Linked_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		LinkedList l=new LinkedList();
		System.out.println("Diftrent types of foods..");
		int n = s.nextInt();		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the Name..");
			String f=s.next();
			System.out.println("Enter the incredience..");
			String in=s.next();
			System.out.println("Enter the prepration..");
			String pre=s.next();
			System.out.println("Enter the Recipies..");
			String re=s.next();
			System.out.println("Enter the decration..");
			String de=s.next();
			l.add(f);
			l.add(in);
			l.add(pre);
			l.add(re);
			l.add(de);
		}
		Iterator itr = l.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
