package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import org.openqa.selenium.WebElement;

public class Fruits {


	public static void main(String[] args) {
		
		List<String> list =new ArrayList<String>(); 
		list.add("Cherry");
		list.add("Berry"); 
		list.add("Cherry"); 
		list.add("Guava");
		list.add("Waterapple"); 
		list.add("Pineapple");
		list.add("Dragon");
		Collections.sort(list);
		for (String string : list) {
			System.out.println(string);
			
		};

		/*
		 * boolean empty=list.isEmpty(); System.out.println("Is Check "+empty);
		 * list.clear(); System.out.println(list.isEmpty());
		 */


		/* 
		 * String str=list.get(3); System.out.println("Get fruit " +str);
		 * 
		 * boolean check=list.contains("Pineapple");
		 * System.out.println("Has fruits  "+check) ;
		 * 
		 * 
		 * //before remove for (String everyfruit : list) {
		 * System.out.println(everyfruit);
		 * 
		 * } System.out.println("---");
		 * 
		 * //After remove boolean isremove=list.remove("Cherry");
		 * System.out.println("removing  " + isremove); for (String everyfruit : list) {
		 * System.out.println(everyfruit);
		 * 
		 * } int size=list.size(); System.out.println("Size " +size);
		 */


		//TreeSet-sort,HashSet-random, LinkedHashset-Insertion order

		/*Set<String> set=new LinkedHashSet<String>();
		set.add("Cherry");
		set.add("Berry");
		set.add("Cherry");
		set.add("Guava");
		set.add("Waterapple");
		set.add("Pineapple");
		set.contains("Berry");


		//no get 

		List <String> newlist=new ArrayList<String>(set);
		for (String string : newlist) {
			System.out.println(string);

		}

		String str=newlist.get(1);
		System.out.println(str);


		boolean test= set.contains("Waterapple");
		System.out.println(test);
		System.out.println(set.isEmpty());
		set.clear();

		System.out.println(set.size());
		for (String mystr : set) {
			System.out.println(mystr);
*/
}
}
