package sparsematrix;


import org.junit.Test;

public class SparseMatrixTest {
    /**
     * invalid input
     */
    @Test(expected = AssertionError.class)
    public void sparseMatrixTest() {
        new SparseMatrix(null);
    }
}
