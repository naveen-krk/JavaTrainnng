package exercisee;

import java.util.Arrays;

public class exp6 {
	public static void main( String args[] ) {
	      int[] oldArray = {1, 2, 3};
	      int[] newArray = new int[6];
	      System.arraycopy(oldArray, 0, newArray, 0, 3);
	      oldArray = null;
	      System.out.println(Arrays.toString(newArray));
	    }
}
