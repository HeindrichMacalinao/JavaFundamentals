package javaPackage;
import java.util.Scanner;
public class SnakeMatrix 
{

	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = sc.nextInt();

    int[][] matrix = new int[n][n];
    int num = 1;

    for (int row = n - 1; row >= 0; row--) 
    {
        if ((n - row) % 2 == 1) 
        { 
            for (int col = 0; col < n; col++) 
            {
                matrix[row][col] = num++;
            }
        } 
        
        else 
        { 
            for (int col = n - 1; col >= 0; col--) 
            {
                matrix[row][col] = num++;
            }
        }
    }

    for (int i = 0; i < n; i++) 
    {
        for (int j = 0; j < n; j++) 
        {
            System.out.print(matrix[i][j] + " ");
        }
        System.out.println();
    }
    }
}
