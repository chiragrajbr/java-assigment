//to iterate array list
import java.util.*;
class ok{
	public static void main(String args[]){
		ArrayList a=new ArrayList();
		a.add(10);
		a.add(20);
		a.add(30);
		for(Object number : a){
			System.out.println(number);
		}
	}
}