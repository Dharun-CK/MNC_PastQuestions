package Juspay_Training;
import java.util.*;
public class Max_sumcycle {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int N = 23;
	int[] edges = {4,4,1,4,13,8,8,8,0,8,14,9,15,11,-1,10,15,22,22,22,22,22,21};

	    int maxCycleLength = findLargestCycleLength(edges);
	    System.out.println(maxCycleLength);
	}

	public static int findLargestCycleLength(int[] edges) {
	    int maxCycleLength = -1;
	    boolean[] visited = new boolean[edges.length];
	    boolean[] inCurrentPath = new boolean[edges.length];
	    
	    for (int i = 0; i < edges.length; i++) {
	        if (!visited[i]) {
	            int current = i;
	            int cycleLength = 0;
	            
	            while (current != -1 && !visited[current]) {
	                visited[current] = true;
	                inCurrentPath[current] = true;
	                current = edges[current];
	                cycleLength+=current;
	            }
	            
	            if (current != -1 && inCurrentPath[current]) {
	                maxCycleLength = Math.max(maxCycleLength, cycleLength);
	                System.out.println(maxCycleLength);
	            }
	            
	            while (current != -1 && inCurrentPath[current]) {
	                inCurrentPath[current] = false;
	                current = edges[current];
	            }
	        }
	    }
	    
	    return maxCycleLength;
	}
	
	
	
}
