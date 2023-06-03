

	public class Assignment4_Arrays_Q5 {
	    public static int calculateCompleteRows(int n) {
	        int count = 0;
	        int row = 1;

	        while (n >= row) {
	            n -= row;
	            row++;
	            count++;
	        }

	        return count;
	    }

	    public static void main(String[] args) {
	        int n = 5;

	        int completeRows = calculateCompleteRows(n);

	        System.out.println(completeRows);
	    }
	}

