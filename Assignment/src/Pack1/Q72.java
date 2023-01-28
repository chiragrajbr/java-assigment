// serialize arraylist in java
package Pack1;

import java.util.ArrayList;
import java.util.Collections;

public class Q72 {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(105);
		a.add(102);
		a.add(103);
		a.add(101);
		a.add(104);
		Collections.sort(a);
		System.out.println(a);

	}

}
