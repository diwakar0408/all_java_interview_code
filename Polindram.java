public class Polindram{
	public static void main(String args[])
	{
		int n=122;
        int n1=n;
		int rev=0;
       while(n!=0){
		   rev=rev*10+(n%10);
		   n=n/10;
	   }
	   System.out.println("rev_number:"+rev);
	   if(rev==n1){
	System.out.println("YES");
}	else{
	System.out.println("No");
}   
	}
}