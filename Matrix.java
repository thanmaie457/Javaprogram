import java.util.Scanner;
class MatrixMultiplication {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter the Rows: ");
 int r = sc.nextInt();
 System.out.print("Enter the Columns: ");
 int c = sc.nextInt();
 int[][] a = new int[r][c];
 int[][] b = new int[r][c];
 int[][] result = new int[r][c];
 // Input for matrix A
 for(int i = 0; i < r; i++){
 for(int j = 0; j < c; j++){
 System.out.print("Enter the ["+i+"]["+j+"] a matrix: ");
 a[i][j] = sc.nextInt();
 }
 }
 
 // Input for matrix B
 for(int i = 0; i < r; i++){
 for(int j = 0; j < c; j++){
 System.out.print("Enter the ["+i+"]["+j+"] b matrix: ");
 b[i][j] = sc.nextInt();
 }
 }
 
 // Matrix multiplication and display
 for(int i = 0; i < r; i++){
 for(int j = 0; j < c; j++){
 for(int k = 0; k < c; k++){
 result[i][j] += a[i][k] * b[k][j];
 }
 System.out.print(result[i][j] + " ");
 }
 System.out.println();
 }
 }
}