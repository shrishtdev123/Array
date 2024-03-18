public class SetMatrixZero
{

    public static void setMatrixZero(int[][] matrix)
    {
        int m = matrix.length;
        int n = matrix[0].length;

        // Arrays to store whether a row or column should be zeroed
        boolean[] zeroRows = new boolean[m];
        boolean[] zeroCols = new boolean[n];

        // Mark rows and columns that contain zeros
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                if (matrix[i][j] == 0)
                {
                    zeroRows[i] = true;
                    zeroCols[j] = true;
                }
            }
        }

        // Set rows to zero
        for (int i = 0; i < m; i++)
        {
            if (zeroRows[i])
            {
                for (int j = 0; j < n; j++)
                {
                    matrix[i][j] = 0;
                }
            }
        }

        // Set columns to zero
        for (int j = 0; j < n; j++)
        {
            if (zeroCols[j])
            {
                for (int i = 0; i < m; i++)
                {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public static void printMatrix(int[][] matrix)
    {
        for (int[] row : matrix)
        {
            for (int num : row)
            {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        int[][] matrix =
                {
                {1, 2, 3},
                {4, 0, 6},
                {7, 8, 9}
              };

        for(int i=0;i<matrix[1].length;i++)
        {
            System.out.print(matrix[2][i]+" ");
        }
        System.out.println();
        System.out.println("Original matrix:");
        printMatrix(matrix);

        setMatrixZero(matrix);

        System.out.println("\nMatrix after setting zeros:");
        printMatrix(matrix);
    }

}
