package sparsematrix;

public final class SparseMatrix {
    final private int[][] finalSparseMatrix;
    final private int matRow;
    final private int matCol;
    final private int sparseCol;

    public SparseMatrix(int[][] sparseMatrix) {
        if (sparseMatrix == null) {
            throw new AssertionError("Invalid input");
        }
        this.matRow = sparseMatrix.length;
        this.matCol = sparseMatrix[0].length;
        this.finalSparseMatrix = convertToSparse(sparseMatrix);
        this.sparseCol = finalSparseMatrix[0].length;
    }

    public int[][] transpose() {
        int[][] transposedMatrix = new int[matCol][matRow];
        for (int i = 0; i < sparseCol; i++) {
            transposedMatrix[finalSparseMatrix[1][i]][finalSparseMatrix[0][i]] = finalSparseMatrix[2][i];
        }
        return transposedMatrix;
    }

    public boolean isSymmetric() {
        if (this.matRow != this.matCol) {
            return false;
        }
        int[][] originalMatrix = convertToNormal();
        int[][] transposedMatrix = this.transpose();
        for (int i = 0; i < matRow; i++) {
            for (int j = 0; j < matCol; j++) {
                if (originalMatrix[i][j] != transposedMatrix[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public int[][] addMatrix(int[][] matrix) {
        if (matRow != matrix.length || matCol != matrix[0].length) {
            throw new AssertionError("Can't add matrix with different dimension");
        }
        int[][] oldMatrix = convertToNormal();
        int[][] result = new int[matRow][matCol];
        for (int i = 0; i < matRow; i++) {
            for (int j = 0; j < matCol; j++) {
                result[i][j] = matrix[i][j] + oldMatrix[i][j];
            }
        }
        return result;
    }

    public int[][] multiply(int[][] matrix) {
        if (this.matRow != matrix[0].length) {
            throw new AssertionError("Matrix is not valid");
        }
        int[][] oldMatrix = convertToNormal();
        int[][] result = new int[matRow][matrix[0].length];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                for (int k = 0; k < matCol; k++) {
                    result[i][j] += oldMatrix[i][k] * matrix[k][j];
                }
            }
        }
        return result;
    }

    private int[][] convertToNormal() {
        int[][] normalMatrix = new int[matRow][matCol];
        for (int i = 0; i < sparseCol; i++) {
            normalMatrix[finalSparseMatrix[0][i]][finalSparseMatrix[1][i]] = finalSparseMatrix[2][i];
        }
        return normalMatrix;
    }

    private int[][] convertToSparse(int[][] sparseMatrix2) {
        int size = 0;
        for (int[] aSparseMatrix2 : sparseMatrix2) {
            for (int anASparseMatrix2 : aSparseMatrix2) {
                if (anASparseMatrix2 != 0) {
                    size++;
                }
            }
        }
        int[][] tempSparseMatrix = new int[3][size];
        int k = 0;
        for (int row = 0; row < sparseMatrix2.length; row++) {
            for (int col = 0; col < sparseMatrix2[row].length; col++) {
                if (sparseMatrix2[row][col] != 0) {
                    tempSparseMatrix[0][k] = row;
                    tempSparseMatrix[1][k] = col;
                    tempSparseMatrix[2][k] = sparseMatrix2[row][col];
                    k++;
                }
            }
        }
        return tempSparseMatrix;
    }

}