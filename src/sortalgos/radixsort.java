package sortalgos;

public class radixsort {
	int[] arr;
	boolean istime;
	radixsort(int[] para, int lenth)
	{
		
		arr=new int[lenth];

		for(int i=0;i<lenth;i++)
		{
			arr[i]=para[i];
		}

	}
	void swap(int a, int b)
	{
		int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
	
	int getmax(int[] array, int lenth)
	{
		int max=arr[0];
		for(int i=1;i<lenth;i++)
		{
			if(arr[i]>max)
				max=arr[i];
			
		}
		return max;
	}
	
	
	void countsort(int[] arr, int lenth, int exp)
	{
		int[] temp=arr.clone();
		int max=10;
		
		int newarr;
		int[] count = new int[max+1];
		for(int i=0;i<lenth;i++)
		{			
			newarr=(arr[i]/exp)%10;
			count[newarr]++;
		}
		for(int i=1;i<max+1;i++)
		{
			count[i]+=count[i-1];
		}
		
		for(int i=lenth-1;i>0;i--)
		{
			newarr=(temp[i]/exp)%10;
			int pos=count[newarr]-1;
			arr[pos]=temp[i];
			count[newarr]--;
		}
	}
	int[] sort(int lenth, boolean desc, boolean istime)
	{	
		
		
		long startTime = System.nanoTime();
		int maxa=getmax(arr, lenth);
		
		for(int base=1;(maxa/base)>0;base*=10)
		{
			countsort(arr, lenth, base);
			
		}
			
		
		
		 
		long endTime = System.nanoTime();
		long duration = (endTime - startTime);
		if(istime)
			System.out.println("Execution time: " + duration/1000000.0);
		return arr;
	}
	
	
	int[] sorta(int lenth, boolean istime)
	{	
		return sort(lenth, false, istime);	
	}
	
	int[] sortd(int lenth, boolean istime)
	{	
		return sort(lenth, true, istime);	
	}
	
	
	
	
}
