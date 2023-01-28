// convert array to list
// we r using iteration method
package Pack1;

import java.util.ArrayList;

public class Q64 {

	public static void main(String[] args) {
	
	int[] a= {1,2,3,6};
	ArrayList b=new ArrayList();
	for (int no:a) {
		b.add(no);
	}
	System.out.println(b);
    }

}
