package javaa;

public class array2 {

    public static void main(String[] args) {
    	
        int myarray[][] = { {45, 3, 4, 2}, {2, 34, 42, 53} };
        int n=myarray.length;
        int c[][] = new int[n][myarray[0].length]; // Adjust dimensions of c

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < myarray[i].length; j++) {
                c[i][j] = myarray[0][j] -myarray[1][j]; // Add corresponding elements
            }
        }

        // Print the resulting array c
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                System.out.print(c[i][j] + " ");
            }
            //System.out.println(); // Move to the next line after each row
        
        System.out.println();
        }
}
}