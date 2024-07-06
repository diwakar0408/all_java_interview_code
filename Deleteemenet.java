public class Deleteemenet{
	public static void main(String args[])
	{
		int i;
		int a[]={1,2,3,4,5};
		int len=a.length;
		int b[]=new int[len-1];
		int remove=2,index=0;
		for(i=0;i<len;i++)
		{
			if(a[i]!=remove)
			{
				b[index]=a[i];
				index++;
			}
		}
		for(i=0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");
		}
	}
}