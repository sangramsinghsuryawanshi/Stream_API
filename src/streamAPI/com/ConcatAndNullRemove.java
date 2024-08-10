package streamAPI.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class ConcatAndNullRemove 
{
	public static void main(String[] args) 
	{
		ArrayList<String> l = new ArrayList<String>(Arrays.asList("java","c","c++","ruby",null,null));
		System.out.println("Given list is: "+l);
		
		System.out.println("Remove null: "+l.stream().filter(a->a!=null).toList());
		
		ArrayList<String> l1 = new ArrayList<String>(Arrays.asList("Orange","Apple"));
		System.out.println("Concat: "+Stream.concat(l1.stream(), l.stream()).toList());
	}
}
