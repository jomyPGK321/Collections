package Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Iterator;
import java.util.LinkedList;
public class HashSete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner s=new Scanner(System.in);
		HashSet set=new HashSet();
		set.add("Priyanka ");
		set.add("iswarya");
		set.add("ilyana");
		set.add("july");
		set.add("iswarya");
		set.add("ilyana");
		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
