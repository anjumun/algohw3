import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * 
 * @author antonio munoz
 * @version 012312016
 * 
 */
public class Assignment3 {

	public static void main (String[] args){
		Scanner scan = new Scanner(System.in);
		HashSet<String> hash = new HashSet<String>();
		TreeSet<String> tree = new TreeSet<String>();
		
		try {
			Scanner in = new Scanner(new File("wordlist"));
			while(in.hasNext()){
				String current = in.next();
				hash.add(current);
				tree.add(current);				
			}
			in.close();
		} catch (FileNotFoundException e) {
			System.out.println("file not found");
 		}
		LinkedList<String> linkedList = new LinkedList<>();
	
		//load linked list with some values
		linkedList.add("john");
		linkedList.add("mary");
		linkedList.add("gary");
		linkedList.add("larry");
		linkedList.add("jerry");
		linkedList.add("terry");
		linkedList.add("Austin");
		linkedList.add("June");
		linkedList.add("Jane");
		linkedList.add("Dustin");
		linkedList.add("Fredrick");
		linkedList.add("Justin");
		
		//prompt user for 
		System.out.println("What nth Employee would you like to remove: ");
		//pass the linkedlist to the downsize function alogn with the nth number to remove.
		downsize(linkedList,scan.nextInt()); 
		scan.close();
		for(String e :linkedList){
			System.out.println(e);			
		}
		
		//part two of homework
		
		long startTime = System.nanoTime();
		if(hash.contains("airfloat")){
			System.out.println("found the String in hashSet took:");
		}
		long endTime = System.nanoTime();

		long duration = (endTime - startTime);
		System.out.println(duration+"ns");
		
		long startTime2 = System.nanoTime();
		if(tree.contains("airfloat")){
			System.out.println("found the String in treeSet took:");
		}
		long endTime2 = System.nanoTime();

		long duration2 = (endTime2 - startTime2);
		System.out.println(duration2+"ns");
		
		
	}
	
	private static void downsize(LinkedList<String> list,int n){
		for(int i =0;i<list.size();i++){
			if(i % n == 0){
				list.remove(i);
			}
			
		}
	}
	
	
	
}
