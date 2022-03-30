//Meira Levi

public class Matricies 
{

	public static final int SIZE = 3;
	
	public static void main(String[] args) 
	{ // variables for inputs
		int matrixA[][] = new int[SIZE][SIZE];
		int matrixB[][] = new int[SIZE][SIZE];
		
		// variables to store the results
		int matrixSum[][] = new int[SIZE][SIZE];
		int matrixDifference[][] = new int[SIZE][SIZE];
		int matrixProduct[][] = new int[SIZE][SIZE];
		
		System.out.println("Initializing matrices...");
		createMatrices(matrixA, matrixB);
		
		System.out.println("\nMatrix A:");
		printMatrix(matrixA);
		
		System.out.println("\nMatrix B:");
		printMatrix(matrixB);
		
		addMatrix(matrixSum, matrixA, matrixB);
		System.out.println("\n\nMatrix Sum:");
		printMatrix(matrixSum);
		
		subMatrix(matrixDifference, matrixA, matrixB);
		System.out.println("\nMatrix Difference:");
		printMatrix(matrixDifference);
		
		mulMatrix(matrixProduct, matrixA, matrixB);
		System.out.println("\nMatrix Product:");
		printMatrix(matrixProduct);
	}

	private static void mulMatrix(int[][] matrixProduct, int[][] matrixA, int[][] matrixB) 
	{

		for (int i=0; i<3; i++)
		{
			for (int j=0; j<3; j++)
			{
				int k=j;
					for (int l=0; l<3; l++)
					{
						int product=0;
						for (int m=0; m<3; m++)
						{
							product+=matrixA[k][m]*matrixB[m][l];
						}
						matrixProduct[j][l] = product;
					}
				

			}
		}
		
	}

	private static void subMatrix(int[][] matrixDifference, int[][] matrixA, int[][] matrixB) 
	{
		for (int i=0; i<3; i++)
		{
			for (int j=0; j<3; j++)
			{
				matrixDifference[i][j] = matrixA[i][j] - matrixB[i][j];
			}
		}
		
	}

	private static void addMatrix(int[][] matrixSum, int[][] matrixA, int[][] matrixB) 
	{
		for (int i=0; i<3; i++)
		{
			for (int j=0; j<3; j++)
			{
				matrixSum[i][j] = matrixA[i][j] + matrixB[i][j];
			}
		}
		
	}

	private static void printMatrix(int[][] matrix) 
	{
		for (int i=0; i<3; i++)
		{
			for (int j=0; j<3; j++)
			{
				System.out.print(matrix[i][j]);
				System.out.print(" ");
			}
			System.out.println("");
		}
		
	}

	private static void createMatrices(int[][] matrixA, int[][] matrixB) 
	{
		int one = 1;
		int two = 9;
		for (int i=0; i<3; i++)
		{
			for (int j=0; j<3; j++)
			{
				matrixA[i][j] = one;
				matrixB[i][j] = two;
				one++;
				two--;
			}
		}
		
		
	}

}
