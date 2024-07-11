import java.util.*;
class Margesort{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.of elements:");
		int n=sc.nextInt();
		int[] array=new int[n];
		for(int i=0;i<n;i++){
			array[i]=sc.nextInt();
		}
		System.out.println("Before sorting the elements:");
		for(int i=0;i<n;i++){
			System.out.print(array[i]+" ");
		}
		Merge_Sort(array,0,array.length-1);
		System.out.println();
		System.out.println("after sorting the elements:");
		for(int i=0;i<n;i++){
			System.out.print(array[i]+" ");
		}
	}
	static void Merge_Sort(int array[],int low,int hight)
	{
		if(low>=hight){
		int mid =(low+hight)/2;
		Merge_Sort(array,low,mid);
		Merge_Sort(array,mid+1,hight);
		Marge(array,low,mid,hight);
		}
	}
	static void Marge(int array[],int low,int mid,int hight){
		Vector<Integer> v=new Vector<Integer>();
		int left=low;
		int right=mid+1;
		while(left<=mid && right<=hight)
		{
			if(array[left]>array[right])
			{
				v.addElement(array[right]);
				right++;
			}else
			{
				v.addElement(array[left]);
				left++;
			}
		}
		while(left<=mid)
		{
			
				v.addElement(array[left]);
				left++;
		}
		while(right<=hight)
		{
				v.addElement(array[right]);
				right++;
		}
		for(int i=low;i<=hight;i++)
		{
			array[i]=(int)v.get(i-low);
		}
	}
}