package string;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.*;
public class FindNum {
	
	private static final String fileName = ".\\src\\string\\name.data"; 
	public static void main(String[] args){
		try{
		Scanner scanner = new Scanner(new File(fileName));
		Pattern pattern = Pattern.compile("[^abce\\s]+");
		List<Integer> list = new ArrayList<Integer>();
		List<String> lists = new ArrayList<String>();
		while(scanner.hasNextLine()){
			Matcher matcher = pattern.matcher(scanner.nextLine());
			while(matcher.find()){
				lists.add(matcher.group(0));
				
			}
		}
		System.out.println(lists);
		}catch(FileNotFoundException e){
			
		}
		
	}

}
