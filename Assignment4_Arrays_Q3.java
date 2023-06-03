

	import java.util.Arrays;

	public class Assignment4_Arrays_Q3 {
	    public static int[][] transposeMatrix(int[][] matrix) {
	        int rows = matrix.length;
	        int cols = matrix[0].length;

	        int[][] transpose = new int[cols][rows];

	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                transpose[j][i] = matrix[i][j];
	            }
	        }

	        return transpose;
	    }

	    public static void main(String[] args) {
	        int[][] matrix = {
	                {1, 2, 3},
	                {4, 5, 6},
	                {7, 8, 9}
	        };

	        int[][] transpose = transposeMatrix(matrix);

	        for (int[] row : transpose) {
	            System.out.println(Arrays.toString(row));
	        }
	    }
	}

