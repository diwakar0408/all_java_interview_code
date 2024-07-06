public class InsertionSpacific
{
	public static void main(String args[])
	{
		int a[]={1,2,3,4,5};
		int b[]=new int[a.length+1];
		for(int i=0;i<=a.length;i++)
		{
			if(i==a.length)
			{
				b[i]=0;
				break;
			}else
			{
				b[i]=a[i];
			}
		}
		
		int inext=3,i;
		for(i=b.length-1;i>=inext;i--)
		{
			if(i>=inext)
			{
				if(i==inext)
			{
				b[inext]=100;
				break;
			}
				swap(b,i-1,i);
			}
		
		}
		for(i=0;i<b.length;i++)
		{System.out.print(b[i]+" ");
		}
		
	}
	public static void swap(int b[],int inext_a,int inext_b)
     {
		int temp=b[inext_a];
		b[inext_a]=b[inext_b];
		b[inext_b]=temp;
     }
}