/**
 * 


/**
 * @author rutvik
 *
 */
import java.util.*;

		
public class FloodFill {

	 public static void fillArea(int x, int y, int original, int fill, int[][] arr) {
	        Stack<int[]> q = new Stack<int[]>();
	        int[] w = new int[21]; 
	        int[] e = new int[70]; 

	        if (arr[x][y] != original) {
	            return;
	        }

	        q.push(new int[]{x, y});

	        while (!q.isEmpty()) {
	            int[] pos = (int[]) q.pop();
	            int i = pos[0];
	            int j = pos[1];
	            if (arr[i][j] == original) {
	                e[0] = i;
	                e[1] = j;
	                w[0] = i;
	                w[1] = j;
	            }


	            while (w[1] > 0 && arr[w[0]][w[1] - 1] == original) { 
	                w[1] -= 1;
	            }

	            while (e[1] < arr[0].length - 1 && arr[e[0]][e[1] + 1] == original) { 
	                e[1] += 1;
	            }

	            for (int a = w[1]; a <= e[1]; a++) { 
	                arr[w[0]][a] = fill;


	                if (w[0] > 0 && arr[w[0] - 1][a] == original) { 
	                    q.push(new int[]{(w[0] - 1), a});
	                }

	                if (w[0] < arr.length - 1 && arr[w[0] + 1][a] == original) {
	                    q.push(new int[] {(w[0] + 1), a});
	                }

	            
	  
	
	  
		 
		    /** Main method **/
	                public static void main(String[] args) {
	                    int testArray[][] = new int[21][70];
	                    for (int i = 0; i < 21; i++) {
	                        testArray[i][i] = 1;
	                        testArray[9-i][i] = 1;
	                    }
	                    testArray[4][7] = 'A';

	                    System.out.println("Array before");

	                    for (int i = 0; i < 21; i++) {
	                        for (int j = 0; j < 70; j++) {
	                            System.out.print(testArray[j][i] + "A ");
	                        }
	                        System.out.println("B");
	                    }

	                    fillArea(6,8,0,7,testArray);

	                    System.out.println("Array after");
	                    for (int i = 0; i < 21; i++) {
	                        for (int j = 0; j < 70; j++) {
	                            System.out.print(testArray[j][i] + "A ");
	                        }
	                        System.out.println("B");
	                    }
	                }

	}


