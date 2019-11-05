package sortalgos;

public class insertionsort {
	int[] arr;
	boolean istime;
	insertionsort(int[] para, int lenth)
	{
		arr = new int[lenth];

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
	int[] sorta(int lenth, boolean istime)
	{	
		return sort(lenth, false, istime);	
	}
	
	int[] sortd(int lenth, boolean istime)
	{	
		return sort(lenth, true, istime);	
	}
	
	int[] sort(int lenth, boolean desc, boolean istime)
	{	
		long startTime = System.nanoTime();
		
		for(int mark=0;mark<lenth;mark++)
		{	
			int temp=mark;
			if(desc==false)
			{
			while(temp>0 && arr[temp]>arr[temp-1])
			{
				
				swap(temp,temp-1);
				temp--;
				
			}
			}
			if(desc==true)
			{
				while(temp>0 && arr[temp]<arr[temp-1])
				{
					
					swap(temp,temp-1);
					temp--;
					
				}
			}
				
		}
		
		
		
		
		
		long endTime = System.nanoTime();
		long duration = (endTime - startTime);
		if(istime)
			System.out.println("Execution time: " + duration/1000000.0);
		return arr;
	}
	
}


















