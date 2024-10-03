/*
 * 
Q6. Wap take a list of employee salaries and find out the  3rd max salary from that list, take a list 10 salary the highest salary must be repeated there.
 Do it by using stream API. you don't have to use inbuilt max and min methods.
 */
package streamAPI.com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ThirdMaxSalaryWithoutMaxMinMethod 
{
	public static void isTMS(List<Integer> l)
	{
		int TMax=l.stream().sorted(Comparator.reverseOrder()).skip(2).mapToInt(Integer::intValue).findFirst().orElse(0);
		System.out.println("Third Max Salary is: "+TMax);
	}
	public static void main(String[] args) 
	{
		List<Integer> l = new ArrayList<>();
		l.add(120000);
		l.add(1246400);
		l.add(120450);
		l.add(137430);
		l.add(1454940);
		System.out.println("Given Salaries is: "+l);
		isTMS(l);
	}
}
