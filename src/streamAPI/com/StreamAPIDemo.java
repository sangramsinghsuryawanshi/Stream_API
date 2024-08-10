package streamAPI.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class StreamAPIDemo 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> l = new ArrayList<Integer>
		(Arrays.asList(1,2,4,5,6,7,2,5,7,3,2));
		System.out.println("all element: "+l);
		List<Integer> l1=l.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println("Even element: "+l1);
		
		List<Integer> l2=l.stream().filter(i->i%2!=0).collect(Collectors.toList());
		System.out.println("Odd element: "+l2);
		
		List<Integer> l3=l.stream().distinct().toList();
		System.out.println("distinct element: "+l3);

		int sum1=l.stream().mapToInt(i->i).sum();
		System.out.println("Sum of element: "+sum1);
		
		long cnt=l.stream().count();
		System.out.println("Count all element: "+cnt);
		
		double avg1=l.stream().mapToDouble(i->i).average().getAsDouble();
		System.out.println("Average of all element: "+avg1);
		
		int m = l.stream().mapToInt(i->i).max().getAsInt();
		System.out.println("Max element: "+m);
		
		int mi = l.stream().mapToInt(i->i).min().getAsInt();
		System.out.println("Max element: "+mi);
		
		
	}
}
