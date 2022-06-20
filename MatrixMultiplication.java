
// You are using Java
import java.util.*;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] mat1 = new int[n][n];
        int[][] mat2 = new int[n][n];
        int[][] mat = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat1[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat2[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = 0;
                for (int k = 0; k < n; k++) {
                    mat[i][j] += mat1[i][k] * mat2[k][j];
                }
                System.out.println(mat[i][j] + " ");
            }
            System.out.println();
        }

    }
}