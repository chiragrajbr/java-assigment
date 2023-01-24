//184 how can we get a character array from string
class ok{
	public static void main(String args[]){
		String myname="chirag";
		for (int i=0;i<=myname.length()-1;i++){
			char a = myname.charAt(i);
			System.out.println(a);
		}
	}
}