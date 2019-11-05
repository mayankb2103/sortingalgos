package sortalgos;

public class bubblesort {
	int[] arr;
	boolean istime;
	bubblesort(int[] para, int lenth)
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
		
		boolean alsort=false;
		long startTime = System.nanoTime();
		
		
		for(int arrend=lenth; !alsort && arrend>1; arrend--)
		{
			alsort=true;
			if(desc==false)
			{
			for(int i=0;i<arrend-1;i++)
			{
				if(arr[i]>arr[i+1])
					swap(i,i+1);
					alsort=false;
					
			}
			}
			else
			{
				for(int i=0;i<arrend-1;i++)
				{
					if(arr[i]<arr[i+1])
						swap(i,i+1);
						alsort=false;
						
				}	
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
