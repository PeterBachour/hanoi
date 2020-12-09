package cfranc.hanoi;

import static org.junit.Assert.*;

import org.junit.Test;

import java.security.cert.TrustAnchor;

public class TourTest {

	Tour tourNonVide = new Tour(2);
	Disque small = new Disque(1);
	Disque medium = new Disque(2);
	Disque tall = new Disque(3);

	boolean expected_False = false;
	boolean isExpected_True = true;


	@Test
	public void testEmpiler_TourNonVideEtTestPlusPetit_True() {
		tourNonVide.disques.add(medium);

		Boolean actual = tourNonVide.empiler(small);
		assertEquals(isExpected_True, actual);
	}

	@Test
	public void testEmpiler_TourNonVideEtTestPlusGrand_False() {
		tourNonVide.disques.add(small);

		Boolean actual = tourNonVide.empiler(tall);
		assertEquals(expected_False, actual);
	}

	@Test
	public void testEmpiler_TourNonVideEtTestTourPleine_False() {
		tourNonVide.disques.add(tall);
		tourNonVide.disques.add(medium);

		Boolean actual = tourNonVide.empiler(small);
		assertEquals(expected_False, actual);
	}

	@Test
	public void testEmpiler_TourVide_True() {
		Boolean actual = tourNonVide.empiler(tall);
		assertEquals(isExpected_True, actual);
	}



}
