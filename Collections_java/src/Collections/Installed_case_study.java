package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Installed_case_study {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList os = new ArrayList();
		int op = 0;
		
		do {
			System.out.println("1.Display Instauled Applications");
			System.out.println("2.Install an Applications");
			System.out.println("3.Uninstall an Applications");
			System.out.println("4.Exit");
			op = s.nextInt();

			if (op == 1) {
				if (os.isEmpty()) {
					System.out.println("Not Instaulled");
				} else {
					Iterator itr = os.iterator();
					while (itr.hasNext())
						
					{
						System.out.println(itr.next());
					}
				}
			} else if (op == 2) {
				System.out.println("Enter the app name");
				String ap = s.next();
				if (os.contains(ap)) {
					System.out.println("App allready Instualled");
				} else {
					os.add(ap);
				}
			} else if (op == 3) {
				
				if (os.isEmpty()) {
					System.out.println("Not Instaulled");
				}
				else
				{
				System.out.println("List of apps");
				Iterator itr = os.iterator();
				int ind = 0;
				while (itr.hasNext()) {
					System.out.println(itr.next()+ "  "+ind);
					ind++;
				}
				System.out.println("Do you wand to delete any app");
				String st1 = s.next();
				String y1 = st1.toLowerCase();
				if (y1.contentEquals("Yes"))
					
					
				{
					System.out.println("Enter the app id");
					int eid = s.nextInt();
					os.remove(eid);
					System.out.println("app uninstaulled");
				}
			}} else if (op == 4) {
				System.exit(0);
			} else {
				System.out.println("invalid option");
			}

		} while (op == 1 || op == 2 || op == 3);

	}
}