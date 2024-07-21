import java.io.*;
import java.util.*;
		
public class test_04 {

	public static void main(String[] args) {
		        LinkedList<String> nums = new LinkedList<String>();

		        Scanner scanner = new Scanner(System.in);
		        String input = scanner.nextLine();
		        nums.add(input);
		        
		        System.out.println(nums);
		        Collections.sort(nums);
		        System.out.println(nums);
		        
		        scanner.close();
		    
		
	}

}
