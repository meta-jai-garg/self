package sparsematrix;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SparseMatrixTest {
	SparseMatrix s;

	@Before
	public void initialize() {
		int[][] sparseMatrix = { { 0, 0, 3, 0, 4 }, { 0, 0, 5, 7, 0 },
				{ 0, 0, 0, 0, 0 }, { 0, 2, 6, 0, 0 } };
		s = new SparseMatrix(sparseMatrix);
	}
	
	@Test
	public void sparse(){
		
	}

}
