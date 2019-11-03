package com.luna.week1;

public class BreakContinue {
	public static void windowPosSum(int[] a, int n) {
	    /** your code here */ 
		for(int i = 0; i < a.length; i++){
		      /** 遇到了负数，就继续下一个循环*/
		       if(a[i] < 0){
		          continue;
		        }
		      for (int j = 1; j <= n; j++){
		        if(i+j >= a.length){ //两个相加超过数组长度就break；
		          break;
		        }
		        a[i] = a[i] + a[i + j];

		      }
		    }
	  }

	  public static void main(String[] args) {
	    int[] a = {1, 2, -3, 4, 5, 4};
	    int n = 3;
	    windowPosSum(a, n);

	    // Should print 4, 8, -3, 13, 9, 4
	    System.out.println(java.util.Arrays.toString(a));
	  }
	
}
