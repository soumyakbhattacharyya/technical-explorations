package foundation.algorithm_part_1;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import foundation.algorithm_part_1.union.find.UF;

public class UFTest {

	@Test
	public void testInit() {
		UF uf = new UF(9);
		assertThat(uf.getElements().length, is(9));

	}
	
	// concept: if two nodes in an array have same value, they are connected
	public void testConnected() {
		UF uf = new UF(9);
		
	}
}
