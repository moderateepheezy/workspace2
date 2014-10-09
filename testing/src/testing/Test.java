package testing;

import java.lang.reflect.Array;
import java.util.Arrays;

import javax.swing.JPanel;

public class Test {
	public static void main(String[] args){
		 int num[] = {34 ,56, 3, 5, 78,42, 21, 67,45, 63, 68};
		 int len = num.length;
		 System.out.println("Unsorted Data");		 
		 for(int i = 0; i < len; i++){
			 System.out.println("\n\t\t"+num[i]);
		 }
		 System.out.println("Sorted Data");
		 Arrays.sort(num);
		 for(int i = 0; i < len; i++){
			 System.out.println("\n\t\t"+num[i]);
		 }
	}
}
