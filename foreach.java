import java.util.*;
class foreach {
	public static void main(String args[]) {
		int[][] xr={{2,1,2,3,4},{6,5,4},{5,5,7,3,6,2},{4,5,6,7}};
		for(int i=0; i<xr.length; i++){
			for(int j=0; j<xr[i].length; j++){
				System.out.print(xr[i][j]+"  ");
			}
			System.out.println();
		}
		//-----------------------------
		System.out.println("---------------------------");
		for(int[] ar : xr){
			for(int a : ar){
				System.out.print(a+"  ");
			}
			System.out.println();
		}
	}
}
