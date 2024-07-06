import java.util.*;
import java.lang.*;
class AnagramString {
	public static void main(String args[]){
		String s1="java",s2="java";
		char a1[]=s1.toCharArray(),a2[]=s2.toCharArray();
		boolean flag=false;
		if(a1.length==a2.length){
			Arrays.sort(a1);
			Arrays.sort(a2);
			for(int i=0;i<a1.length;i++)
			{
				if(!(a1[i]==a2[i]))
				{
					flag=false;
					break;
				}else{
					flag=true;
				}
			}
		}
		if(flag==true)
		{
			System.out.println("True");
		}else{
			System.out.println("False");
		}
	}
}