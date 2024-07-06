class CountNoStrings{
	public static void main(String args[])
	{
		String s="            hii           i am diwakar";
		System.out.println(count(s));
		
	}
	static int count(String s)
	{
		int c=0;
		int k=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' '){
				c++;
				k=i;
				break;
			}
		}
		for(int  i=k;i<s.length();i++)
		{
		if(s.charAt(i)==' '&&s.charAt(i+1)!=' ')
		{
			c++;
		}
		}
		return c;
	}
}