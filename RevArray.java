class RevArray
{
	public static void main(String args[])
	{
		int a[]={1,2,4,5};
		int l=0,h=a.length-1;
		while(l<h)
		{
			int temp=a[l];
			a[l]=a[h];
			a[h]=temp;
			l++;
			h--;
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}