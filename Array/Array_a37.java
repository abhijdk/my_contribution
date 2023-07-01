package may_exm1;


import java.util.*;

public class Array_a37 {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2},
            {3, 4}
        };
        
        ArrayList<ArrayList<Integer>> antiDiagonals = getAntiDiagonals(matrix);
        
        for (ArrayList<Integer> antiDiagonal : antiDiagonals) {
            System.out.println(antiDiagonal);
        }
    }
    
    public static ArrayList<ArrayList<Integer>> getAntiDiagonals(int[][] matrix) {
        int size = matrix.length;
        ArrayList<ArrayList<Integer>> antiDiagonals = new ArrayList<>();
        
        for (int i = 0; i < size; i++) {
            ArrayList<Integer> antiDiagonal = new ArrayList<>();
            int row = 0;
            int col = i;
            
            while (col >= 0) {
                antiDiagonal.add(matrix[row][col]);
                row++;
                col--;
            }
            
            antiDiagonals.add(antiDiagonal);
        }
        
        for (int i = 1; i < size; i++) {
            ArrayList<Integer> antiDiagonal = new ArrayList<>();
            int row = i;
            int col = size - 1;
            
            while (row < size) {
                antiDiagonal.add(matrix[row][col]);
                row++;
                col--;
            }
            
            antiDiagonals.add(antiDiagonal);
        }
        
        return antiDiagonals;
    }
}
