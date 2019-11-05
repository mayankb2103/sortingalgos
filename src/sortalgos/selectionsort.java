package sortalgos;

public class selectionsort 
{
	int[] arr;
	boolean istime;
	selectionsort(int[] para, int lenth)
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
		


		 
//		int lenth=arr.length;
		
		int minindex;
		for(int sortt=0;sortt<lenth;sortt++)
		{
			minindex=sortt;
			for(int unsortf=sortt+1;unsortf<lenth;unsortf++)
			{
				
				if(desc && arr[minindex]<arr[unsortf])
				{
					minindex=unsortf;
				}
				
				if(!desc && arr[minindex]>arr[unsortf])
				{
					minindex=unsortf;
				}
			}
			swap(minindex, sortt);
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
