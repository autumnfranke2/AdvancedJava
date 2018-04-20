package UnitTesting;

import java.awt.List;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class unitTesting {
	
	public long addInts(long x, long y) {
		return x + y;
	}
	public String addStrings(String x, String y) {
			return x + y;
	}
	public int findLen(String s) {
		return s.length();
		
	}
	public Object divXbyY(int x, int y) {
		
		if (x / y > 0) {
			return (x / y);
		}
		else {
			return null;
		}
	}
	public int[] reverseIntArray(int[] IntArray) {
		int len = IntArray.length;
	    int[] output = new int[len];
	    for (int i=0;i<len;i++){
	        output[i]= IntArray[len-1-i];
	        System.out.print(output);
	    }
	    return output;			
	}
	
	public ArrayList<Integer> range(int x, int y, int z, int r) {
		int num1=x;
		int num2=y;
		int num3=z;
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i<r; i++) {
			if (i<r){
				num1 +=1;
				num2 +=1;
				num3 +=1;
			}
			else {
				list.add(num1);
				list.add(num2);
				list.add(num3);
			}
		}
		return(list);
	}

}
