package sortalgos;

public class countingsort {
	int[] arr;
	boolean istime;
	countingsort(int[] para, int lenth)
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
	
	int[] sort(int lenth, boolean desc, boolean istime)
	{	
		
		
		long startTime = System.nanoTime();
		
		int[] temp=arr.clone();
		int max=0;
		for(int i=0;i<lenth;i++)
		{
			if(arr[i]>max)
				max=arr[i];
		}
		
		int[] count = new int[max+1];
		for(int i=0;i<lenth;i++)
		{			
			count[arr[i]]++;
		}
		for(int i=1;i<max+1;i++)
		{
			count[i]+=count[i-1];
		}
		if(desc==false)
		{
		for(int i=0;i<lenth;i++)
		{
			int pos=count[temp[i]]-1;
			arr[pos]=temp[i];
			count[temp[i]]=count[temp[i]]-1;
		}
		}
		else
		{
			for(int i=lenth-1;i>0;i--)
			{
				int pos=count[temp[i]]-1;
				arr[pos]=temp[i];
				count[temp[i]]=count[temp[i]]-1;
			}	
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
