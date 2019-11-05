package sortalgos;
import java.util.Random;
public class main {
	public static int ELEM=11;
	static int[] generaterandom(int cnt, int max)
	{
        Random rand = new Random(); 

		int[] ret=new int[cnt];
		for(int i=0;i<cnt;i++)
		{
			ret[i]=rand.nextInt(max);	
		}
		return ret;
	}
	static void print(int[] arr, int lenth)
	{
		for(int i=0;i<lenth;i++)
		{
			
				System.out.print(arr[i] + " ");
			
		}
		System.out.println();
	}
	
	static int[] marr1= generaterandom(100000, 1000000);
	static int[] marrs= generaterandom(ELEM, 100);
	public enum sort {
	    SELECTION,
	    INSERTION,
	    QUICK,
	    MERGE,
	    HEAP,
	    BUBBLE,
	    RADIX,
	    COUNTING
	}
	public static void check(sort sortingalgo)
	{	
		int[] sorted;
		switch (sortingalgo)
		{
		case SELECTION:
		{
			System.out.print("Before: ");
			print(marrs, ELEM);
			System.out.print("After : ");
			
			selectionsort ss=new selectionsort(marrs, ELEM);
			sorted=ss.sorta(ELEM, false);
			print(sorted, ELEM);
			
			
			
			selectionsort ss0=new selectionsort(marr1, 100000);
			int[] marr=ss0.sortd(marr1.length, false);
			
			
			selectionsort ss1=new selectionsort(marr, marr.length);
			
			for(int i=10; i<1000000; i=i*10)
			{
				sorted=ss1.sorta(i, true);
			}
			break;

		}
		case INSERTION:
		{
			System.out.print("Before: ");
			print(marrs, ELEM);
			System.out.print("After : ");
			insertionsort ss=new insertionsort(marrs, ELEM);
			sorted=ss.sortd(ELEM, false);
			print(sorted, ELEM);
			
			
			
			insertionsort ss0=new insertionsort(marr1, 100000);
			int[] marr=ss0.sortd(marr1.length, false);
			
			
			insertionsort ss1=new insertionsort(marr, marr.length);
			
			for(int i=10; i<1000000; i=i*10)
			{
				sorted=ss1.sorta(i, true);
			}
			break;
		}
		
		
		case BUBBLE:
		{
			System.out.print("Before: ");
			print(marrs, ELEM);
			System.out.print("After : ");
			bubblesort ss=new bubblesort(marrs, ELEM);
			

			sorted=ss.sorta(ELEM, false);
			print(sorted, ELEM);
			
			
			
//			bubblesort ss0=new bubblesort(marr1, 100000);
			int[] marr=marr1;
			
			
			bubblesort ss1=new bubblesort(marr, marr.length);
			
			for(int i=10; i<1000000; i=i*10)
			{
				sorted=ss1.sorta(i, true);
			}
			break;
		}

		case COUNTING:
		{
			System.out.print("Before COUNTING: ");
			print(marrs, ELEM);
			System.out.print("After : ");
			
			countingsort ss=new countingsort(marrs, ELEM);
//			
//
			sorted=ss.sortd(ELEM, false);
			print(sorted, ELEM);
//			
//			
//			

			int[] marr=marr1;
			
//			
			countingsort ss1=new countingsort(marr, marr.length);
			
			for(int i=10; i<1000000; i=i*10)
			{
				sorted=ss1.sorta(i, true);
			}
			break;
		}
		
		case RADIX:
		{
			System.out.print("Before RADIX: ");
			print(marrs, ELEM);
			System.out.print("After : ");
			
			radixsort ss=new radixsort(marrs, ELEM);
//			
//
			sorted=ss.sorta(ELEM, false);
			print(sorted, ELEM);
			
//			
			if(false)
			{

			int[] marr=marr1;
			
//			
			radixsort ss1=new radixsort(marr, marr.length);
			
			for(int i=10; i<1000000; i=i*10)
			{
				sorted=ss1.sorta(i, true);
			}
			}
			break;
		}
		case QUICK:
		{
			System.out.print("Before RADIX: ");
			print(marrs, ELEM);
			System.out.print("After : ");
			
			quicksort ss=new quicksort(marrs, ELEM);
//			
//
			sorted=ss.sorta(ELEM, false);
			print(sorted, ELEM);
			
//			
			if(true)
			{

			int[] marr=marr1;
			
//			
			quicksort ss1=new quicksort(marr, marr.length);
			
			for(int i=10; i<1000000; i=i*10)
			{
				sorted=ss1.sorta(i, true);
			}
			}
			break;
		}
		
		case MERGE:
		{
			System.out.print("Before RADIX: ");
			print(marrs, ELEM);
			System.out.print("After : ");
			
			mergesort ss=new mergesort(marrs, ELEM);
//			
//
			sorted=ss.sorta(ELEM, false);
			print(sorted, ELEM);
			
//			
			if(true)
			{

			int[] marr=marr1;
			
//			
			mergesort ss1=new mergesort(marr, marr.length);
			
			for(int i=10; i<1000000; i=i*10)
			{
				sorted=ss1.sorta(i, true);
			}
			}
			break;
		}

		
		default:
			break;
		}

		
				
		
			
	}
	public static void main(String[] args) {
		
		
		
		check(sort.MERGE);
	}

}
