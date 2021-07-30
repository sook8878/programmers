package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class 예산 {
	/*
	 * import java.util.Arrays;
	 * 
	 * class Solution { public int solution(int[] d, int budget) { int answer = 0;
	 * 
	 * int count = 0;
	 * 
	 * Arrays.sort(d); for (int i = 0; i < d.length; i++) {
	 * 
	 * 
	 * if(answer + d[i] > budget) { break; } answer += d[i]; count ++; } return
	 * count; } }
	 */

	
	public static void main(String[] args) {
		
		int[] d = {2,2,3,3};
		
		int budget = 10;
		
		 
        int answer = 0;

        int count = 0;
        
        Arrays.sort(d);
        for (int i = 0; i < d.length; i++) {
			
			System.out.println(d[i]);
			System.out.println("answer = " + answer);
			
			if(answer + d[i] > budget) {
				System.out.println("count = " + count);
				 break;
			}
			answer += d[i];
			count ++;
		}
	}
	
}
