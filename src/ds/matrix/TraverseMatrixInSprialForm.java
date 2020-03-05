package ds.matrix;

/**
 * 
 * @author Randhir Raj
 * Problem - Given a 2D array, print it in spiral form
 * Input:
        1    2   3   4
        5    6   7   8
        9   10  11  12
        13  14  15  16
	Output: 
	1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10 
	
	
	Input:
	        1   2   3   4  5   6
	        7   8   9  10  11  12
	        13  14  15 16  17  18
	Output: 
	1 2 3 4 5 6 12 18 17 16 15 14 13 7 8 9 10 11
	
	link - https://www.geeksforgeeks.org/print-a-given-matrix-in-spiral-form/
	
	Soln - use i for row and j for column, 
	so I have taken 
	i1 for starting row 
	i2 for ending row 
	j1 for starting column
	j2 for ending column
	
	1) start traversing from first row i.e from j1 to j2. you have traversed the i1 so increase it by 1.
	2) now traverse last column i.e from i1 to i2, now you have traversed the j2 so decrease it by 1.
	3) now traverse last row from j2 to j1, so basically you have travered the i2 so decrese it by 1.
	4) now traverse the first column from i2 to i1, so basically you have traversed the j1 so increase it by 1.
	5) Do from step 1 to 4 until i2 > i1
	   
 */

public class TraverseMatrixInSprialForm {
	public static void main(String[] args) {
		int[][] matrix= {
					  {1,2,3,4},
		              {5,6,7,8},
		              {9,10,11,12},
		              {13,14,15,16}
					};
		
		
		printMatrixInSpriralForm(matrix);
	}
	
	public static void printMatrixInSpriralForm(int[][] matrix){
		int i1=0;
		int i2=matrix.length-1;
		int j1=0;
		int j2=matrix[0].length-1;
		
		while(i2>i1) {
			for(int k=j1;k<=j2;k++) {
				System.out.println(matrix[i1][k]);
			}
			i1++;
			for(int k=i1;k<=i2;k++) {
				System.out.println(matrix[k][j2]);
			}
			j2--;
			for(int k=j2;k>=j1;k--) {
				System.out.println(matrix[i2][k]);
			}
			i2--;
			for(int k=i2;k>=i1;k--) {
				System.out.println(matrix[k][j1]);
			}
			j1++;
		}
	}
}
