class ReverseString_R{
	public static void main(String args[]){
		String s="diwakar";
		reverseString(s,s.length()-1);
	}
	 static void reverseString(String s,int a){
		if(a>=0){
			System.out.print(s.charAt(a));
			reverseString(s,a-1);
		}
	}
}