//add elements at particular index
package Pack1;

import java.util.ArrayList;

public class Q68 {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add("one");
		a.add("three");
		a.add("four");
		a.add(1, "two");
		System.out.println(a);

	}

}
