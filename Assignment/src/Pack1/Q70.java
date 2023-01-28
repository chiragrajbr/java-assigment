// convert linkedlist to array list
package Pack1;

import java.util.ArrayList;
import java.util.LinkedList;

public class Q70 {

	public static void main(String[] args) {
		LinkedList a=new LinkedList();
		a.add("chirag");
		a.add("raj");
		ArrayList b=new ArrayList(a);
		System.out.println(b);
	}

}
