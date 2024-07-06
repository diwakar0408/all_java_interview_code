import java.util.StringTokenizer;
import java.lang.*;
class Split{
public static void main(String args[])
{
	String s="   diwakar         i am d      iwa";
	StringTokenizer s1=new StringTokenizer(s," ");
	while(s1.hasMoreTokens()){
		System.out.println(s1.nextToken());
	}
}
}