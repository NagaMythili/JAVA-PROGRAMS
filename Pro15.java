public class Pro15 {
    public static void main(String...x) {
        // Original matrix
        char matrix[][] = {
            {'N','A','G'},
            {'A','M', 'Y'},
            {'T', 'H', 'I'}
        };

        // Transpose matrix
        char transposeMatrix[][] = new char[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                transposeMatrix[j][i] = matrix[i][j];
            }
        }

        // Display original matrix
        System.out.println("Original Matrix:");
        displayMatrix(matrix);

        // Display transposed matrix
        System.out.println("Transposed Matrix:");
        displayMatrix(transposeMatrix);
    }

    // Display the matrix
    public static void displayMatrix(char matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
