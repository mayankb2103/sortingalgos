package sortalgos;

public class mergesort {
	int[] arr;
	boolean istime;
	mergesort(int[] para, int lenth)
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

	void sortmerge(int[] A)
	{
		
		int lenth=A.length;
		if(lenth<2)
			return;
		int mid=lenth/2;
		int[] L=new int[mid];
		int[] R=new int[lenth-mid];
		for(int i=0;i<lenth;i++)
		{
			if(i<mid)
			{
				L[i]=A[i];
			}
			else
				R[i-mid]=A[i];
		}
		
		sortmerge(L);
		sortmerge(R);
		merge(L,R,A);
		
		
		
		
		
		
		
		
		
		
	}
	
	
	void merge(int[] L, int[] R, int[] M)
	{
		int nL=L.length;
		int nR=R.length;
		int l=0;
		int r=0;
		int m=0;
		while(l<nL && r<nR)
		{
			if(L[l]<R[r])
			{
				M[m]=L[l];
				l++;
			}
			else
			{
				M[m]=R[r];
				r++;
			}
			m++;
		}
		while(l<nL)
		{
			M[m]=L[l];
			l++;
			m++;
		}
		while(r<nR)
		{
			M[m]=R[r];
			r++;
			m++;
		}
	}
	
	int[] sort(int lenth, boolean desc, boolean istime)
	{	
		
		
		long startTime = System.nanoTime();
		sortmerge(arr);		
		 
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
