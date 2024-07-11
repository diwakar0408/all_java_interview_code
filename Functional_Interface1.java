//Functional_Interface1
interface Functional1{
	int String_Func(String s);
}
class Functional_Interface1 {
	static int m1(Functional1 l, String s){
		return l.String_Func(s);
	}
	public static void main(String args[]){
	String in="i Love You";
	int n=m1((String s)->{
		return s.length();
	},in);
	System.out.println(n);
	}
	
}