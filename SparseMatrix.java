package sparsematrix;

public final class SparseMatrix {
	final private int[][] finalSparseMatrix;
	final private int matRow;
	final private int matCol;
	final private int sparseRow;
	final private int sparseCol;

	public SparseMatrix(int[][] sparseMatrix) {
		this.matRow = sparseMatrix.length;
		this.matCol = sparseMatrix[0].length;
		this.finalSparseMatrix = convertToSparse(sparseMatrix);
		this.sparseRow = finalSparseMatrix.length;
		this.sparseCol = finalSparseMatrix[0].length;
	}

	public int[][] transpose() {
		int[][] transposedMatrix = new int[matCol][matRow];
		for (int i = 0; i < finalSparseMatrix[0].length; i++) {
			transposedMatrix[finalSparseMatrix[1][i]][finalSparseMatrix[0][i]] = finalSparseMatrix[2][i];
		}
		return transposedMatrix;
	}

	private int[][] convertToSparse(int[][] sparseMatrix2) {
		int size = 0;
		for (int i = 0; i < sparseMatrix2.length; i++) {
			for (int j = 0; j < sparseMatrix2[i].length; j++) {
				if (sparseMatrix2[i][j] != 0) {
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

	public boolean isSymmetric() {
		int[][] temp = this.transpose();
		for (int i = 0; i < finalSparseMatrix[0].length; i++) {
			if (temp[finalSparseMatrix[1][i]][finalSparseMatrix[0][i]] != finalSparseMatrix[2][i]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int[][] sparseMatrix = { { 0, 1, 2 }, { 0, 3, 4 }, { 0, 5, 6 } };
		SparseMatrix s = new SparseMatrix(sparseMatrix);
		int[][] temp = s.transpose();

		for (int i = 0; i < temp.length; i++) {
			for (int j = 0; j < temp[i].length; j++) {
				System.out.print(temp[i][j]);
			}
			System.out.println();
		}
		System.out.println(s.isSymmetric());
	}
}
