/*
 * Q3.Given a list of strings: ["apple", "banana", "orange", "grape", "pear"], use the Stream 
 * API to filter out the fruits with more than 5 characters, convert them to uppercase, and concatenate them into 
 * a single string. The final result should be "BANANAORANGEGRAPE".
 */
package streamAPI.com;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class JoinAllStringToUpperCase 
{
	public static String isJAS(List<String> li)
	{
		String ls = li.stream().filter(a->a.length()>5).map(s->s.toUpperCase()).collect(Collectors.joining());
		return ls;
	}
	public static void main(String[] args) 
	{
		List<String> li = new ArrayList<>();
		li.add("apple");
		li.add("banana");
		li.add("orange");
		li.add("grape");
		li.add("pear");
		System.out.println("Given list is: "+li);
		System.out.println("Answer: "+isJAS(li));
	}
}
