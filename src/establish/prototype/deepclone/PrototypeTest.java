package establish.prototype.deepclone;

import java.io.IOException;

import org.junit.Test;

public class PrototypeTest {

	@Test
	public void testPrototype() throws ClassNotFoundException, IOException {
		TheGreatestSage sage = new TheGreatestSage();
		sage.change();
	}

}
