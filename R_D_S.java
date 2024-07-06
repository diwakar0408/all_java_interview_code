 import java.util.*;
 public class R_D_S
 {
public static void main(String args[])
{
	String str="rrrrrrrrraaaaa";
	System.out.println(Remove(str));
	
}
 static String Remove(String s)
{
	Set<Character> set=new HashSet<>();
	StringBuffer sb=new StringBuffer();
	for(int i=0;i<s.length();i++)
	{
		char c=s.charAt(i);
		if(!set.contains(c))
		{
			set.add(c);
			sb.append(c);
		}
	}
	
	return sb.toString();
} 
 }