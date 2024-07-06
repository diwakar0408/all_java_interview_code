import java.lang.*;
class FirstElement
{
	public static void  main(String args[])
	{
		String str="hii diwakar love you";
		splitPrint(str);
	}
	static void splitPrint(String str)
	{
		String s[]=str.split(" ");
		for(int i=0;i<s.length;i++)
		{
			
			System.out.print(s[i].charAt(0)+" ");
		}
	}
}