package sortalgos;

public class quicksort {
	int[] arr;
	boolean istime;
	quicksort(int[] para, int lenth)
	{
		
		arr=new int[lenth];

		for(int i=0;i<lenth;i++)
		{
			arr[i]=para[i];
		}

	}
	void swap(int[] ar, int a, int b)
	{
		int temp=ar[a];
		ar[a]=ar[b];
		ar[b]=temp;
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
	
	static void print(int[] arr, int start,int end)
	{
		for(int i=start;i<end;i++)
		{
			
				System.out.print(arr[i] + " ");
			
		}
		System.out.println();
	}

	int partition(int[] A, int start, int end)
	{
		int pindex=start;
		int pivot=A[end];
		for(int i=start;i<end;i++)
		{
			if(A[i]<pivot)
			{
				swap(A,i, pindex);
				pindex++;
			}			
		}
		swap(A,end, pindex);
		return pindex;
	}
	
	
	void quicks(int[] A, int start, int end)
	{
		if(start<end)
		{
			int pindex;

			pindex=partition(A, start, end);
			
			
			quicks(A, start, pindex-1);
			quicks(A, pindex+1, end);
//			
		}
		
	}
	
	int[] sort(int lenth, boolean desc, boolean istime)
	{	
		
		
		long startTime = System.nanoTime();
		quicks(arr,0,lenth-1);		
		 
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
