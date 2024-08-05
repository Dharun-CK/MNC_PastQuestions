package Juspay_Training;
import java.util.*;
public class Max_Weightnode {
	
	public static int weightnode(int N,int []Edges) {
	int result=0;
	int[]map = new int[N];
	for(int i=0;i<N;i++) {
		if(Edges[i]!=-1) {
			map[Edges[i]]+=i;
		}
	}
	
	for(int i=0;i<N;i++) {
		if(map[i]>map[result]) {
			result = i;
		}
	}
		return result;
	}
	
	
	public static void main(String[] args) {
		int N =23;
		int[] Edges= {4,4,1,4,13,8,8,8,0,8,14,9,15,11,-1,10,15,22,22,22,22,22,21};
		
		int ans = weightnode(N,Edges);
		System.out.println(ans);
	}

}
