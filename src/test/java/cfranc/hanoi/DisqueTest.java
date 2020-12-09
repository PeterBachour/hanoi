package cfranc.hanoi;

import static org.junit.Assert.*;

import org.junit.Test;

public class DisqueTest {
	
	Disque dSmall = new Disque(1);
	Disque dMedium = new Disque(2);
	Disque dTall = new Disque(3);

	@Test
	public void testCompareTo() {
		assertEquals(-1, dSmall.compareTo(dMedium));
		assertEquals(1, dTall.compareTo(dSmall));
		assertEquals(0, dMedium.compareTo(dMedium));
	}

	@Test
	public void compareTo_SmallMedium_Negative(){
		int expected = -1;
		int actual = dSmall.compareTo(dMedium);
		assertEquals(expected, actual);
	}

	@Test
	public void compareTo_TallSmall_Positive(){
		int expected = 1;
		int actual = dTall.compareTo(dSmall);
		assertEquals(expected, actual);
	}

	@Test
	public void compareTo_TallTall_Zero(){
		int expected = 0;
		int actual = dTall.compareTo(dTall);
		assertEquals(expected, actual);
	}
}
