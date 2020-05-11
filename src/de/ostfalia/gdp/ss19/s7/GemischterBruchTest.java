package de.ostfalia.gdp.ss19.s7.test;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.DisableOnDebug;
import org.junit.rules.TestRule;
import org.junit.rules.Timeout;

import de.ostfalia.gdp.ss19.s7.GemBruch;

/**
 * @author M.Gründel
 */
public class GemischterBruchTest {

	@Rule
    public TestRule timeout = new DisableOnDebug(
    						  new Timeout(1000, TimeUnit.MILLISECONDS));
	
	@Test
	/**
	 * Konstruktor-Test: Nur ganzahliger, positiver Anteil.
	 */
	public void testPositivInt() {
		assertEquals("2:" , "2" , new GemBruch(2).toString());		
		assertEquals("0:" , "0" , new GemBruch(0).toString());
	}
	
	@Test
	/**
	 * Konstruktor-Test: Nur ganzahliger, negativer Anteil.
	 */
	public void testNegativInt() {
		assertEquals("-5:", "-5", new GemBruch(-5).toString());
	}

	@Test
	/**
	 * Konstruktor-Test: Positiver Zähler und Nenner.
	 */
	public void testPositivIntInt() {
		assertEquals("1/2:", "1/2", 
				new GemBruch(1, 2).toString());		
		assertEquals("2/1:", "2", 
				new GemBruch(2, 1).toString());
		assertEquals("0/7:", "0", 
				new GemBruch(0, 7).toString());
		assertEquals("2/8:", "1/4", 
				new GemBruch(2, 8).toString());
		assertEquals("8/2:", "4", 
				new GemBruch(8, 2).toString());	
		assertEquals("10/4:", "2_1/2", 
				new GemBruch(10, 4).toString());							
	}
	
	@Test
	/**
	 * Konstruktor-Test: Negativer Zähler und positiver Nenner.
	 */
	public void testNegativIntInt() {			
		assertEquals("-1/2:", "-1/2", 
				new GemBruch(-1, 2).toString());
		assertEquals("-3/6:", "-1/2", 
				new GemBruch(-3, 6).toString());
		assertEquals("-8/6:", "-1_1/3", 
				new GemBruch(-8, 6).toString());
		assertEquals("-9/3:", "-3", 
				new GemBruch(-9, 3).toString());		
	}

	@Test
	/**
	 * Konstruktor-Test: Positiver ganzzahliger Anteil, Zähler und Nenner.
	 */
	public void testPositivIntIntInt() {
		assertEquals("1_1/2:", "1_1/2", 
				new GemBruch(1, 1, 2).toString());
		assertEquals("1_1/1:", "2", 
				new GemBruch(1, 1, 1).toString());
		assertEquals("3_0/2:", "3", 
				new GemBruch(3, 0, 2).toString());		
		assertEquals("1_4/8:", "1_1/2", 
				new GemBruch(1, 4, 8).toString());		
		assertEquals("2_9/3:", "5", 
				new GemBruch(2, 9, 3).toString());		
		assertEquals("1_17/8:", "3_1/8", 
				new GemBruch(1, 17, 8).toString());
		assertEquals("1_18/8:", "3_1/4", 
				new GemBruch(1, 18, 8).toString());				
		assertEquals("5_27/3:" , "14", 
				new GemBruch(5, 27, 3).toString());		
	}
	
	@Test
	/**
	 * Konstruktor-Test: Negativer ganzzahliger Anteil, Zähler und Nenner.
	 */
	public void testNegativIntIntInt() {						
		assertEquals("-1_1/1:", "-2", 
				new GemBruch(-1, 1, 1).toString());		
		assertEquals("-1_4/8:", "-1_1/2", 
				new GemBruch(-1, 4, 8).toString());		
		assertEquals("-2_9/3:", "-5", 
				new GemBruch(-2, 9, 3).toString());				
		assertEquals("-1_18/8:", "-3_1/4", 
				new GemBruch(-1, 18, 8).toString());
		assertEquals("-1_17/8:", "-3_1/8", 
				new GemBruch(-1, 17, 8).toString());		
		assertEquals("-5_27/3:" , "-14", 
				new GemBruch(-5, 27, 3).toString());
	}

	@Test
	/**
	 * Multiplikation positiver Brüche.
	 */
	public void testPositivMult() {
		assertEquals("2 * 3:", "6", 
				new GemBruch(2).mul(
				new GemBruch(3)).toString());				
		assertEquals("1/3 * 3:", "1", 
				new GemBruch(1, 3).mul(
				new GemBruch(3)).toString());				
		assertEquals("2/4 * 3:", "1_1/2", 
				new GemBruch(2, 4).mul(
				new GemBruch(3)).toString());			
		assertEquals("1/4 * 3/5:", "3/20", 
				new GemBruch(1, 4).mul(
				new GemBruch(3, 5)).toString());		
		assertEquals("2/4 * 12/6:", "1", 
				new GemBruch(2, 4).mul(
				new GemBruch(12, 6)).toString());
		assertEquals("3/4 * 2/6:", "1/4", 
				new GemBruch(3, 4).mul(
				new GemBruch(2, 6)).toString());		
		assertEquals("5/4 * 7/6:", "1_11/24", 
				new GemBruch(5, 4).mul(
				new GemBruch(7, 6)).toString());		
		assertEquals("1_2/4 * 2_7/6:", "4_3/4", 
				new GemBruch(1, 2, 4).mul(
				new GemBruch(2, 7, 6)).toString());	
		assertEquals("1_5/4 * 4/9:", "1", 
				new GemBruch(1, 5, 4).mul(
				new GemBruch(4, 9)).toString());		
	}
	
	@Test
	/**
	 * Multiplikation negativer Brüche.
	 */
	public void testNegativMult() {		
		assertEquals("-1/4 * -3/5:", "3/20", 
				new GemBruch(-1, 4).mul(
				new GemBruch(-3, 5)).toString());				
		assertEquals("-2_1/2 * -2:", "5", 
				new GemBruch(-2, 1, 2).mul(
				new GemBruch(-2)).toString());				
		assertEquals("-2_1/2 * -5_3/4:", "14_3/8", 
				new GemBruch(-2, 1, 2).mul(
				new GemBruch(-5, 3, 4)).toString());				
	}

	
	@Test
	/**
	 * Multiplikation gemischter Brüche.
	 */
	public void testGemischtMult() {		
		assertEquals("2 * -3:", "-6", 
				new GemBruch(2).mul(
				new GemBruch(-3)).toString());
		assertEquals("-2 * 0:", "0", 
				new GemBruch(-2).mul(
				new GemBruch(0)).toString());		
		assertEquals("-1/3 * 3:", "-1", 
				new GemBruch(-1, 3).mul(
				new GemBruch(3)).toString());				
		assertEquals("-2/4 * 3:", "-1_1/2", 
				new GemBruch(-2, 4).mul(
				new GemBruch(3)).toString());
		assertEquals("2/4 * -3:", "-1_1/2", 
				new GemBruch(2, 4).mul(
				new GemBruch(-3)).toString());								
		assertEquals("3/4 * -2/6:", "-1/4", 
				new GemBruch(3, 4).mul(
				new GemBruch(-2, 6)).toString());		
		assertEquals("-5/4 * 7/6:", "-1_11/24", 
				new GemBruch(-5, 4).mul(
				new GemBruch(7, 6)).toString());		
		assertEquals("-2_1/2 * 2:", "-5", 
				new GemBruch(-2, 1, 2).mul(
				new GemBruch(2)).toString());		
		assertEquals("-2_1/2 * 5_3/4:", "-14_3/8", 
				new GemBruch(-2, 1, 2).mul(
				new GemBruch(5, 3, 4)).toString());
		assertEquals("2_1/2 * -5_3/4:", "-14_3/8", 
				new GemBruch(2, 1, 2).mul(
				new GemBruch(-5, 3, 4)).toString());			
		assertEquals("1_5/4 * -4/9:", "-1", 
				new GemBruch(1, 5, 4).mul(
				new GemBruch(-4, 9)).toString());
	}

	@Test
	/**
	 * Division positiver Brüche.
	 */
	public void testPositivDivide() {
		assertEquals("12 : 3:", "4", 
				new GemBruch(12).div(
				new GemBruch(3)).toString());		
		assertEquals("16 : 3:", "5_1/3", 
				new GemBruch(16).div(
				new GemBruch(3)).toString());				
		assertEquals("3/4 : 2/6:", "2_1/4", 
				new GemBruch(3, 4).div(
				new GemBruch(2, 6)).toString());		
		assertEquals("1/3 : 3/7:", "7/9", 
				new GemBruch(1, 3).div(
				new GemBruch(3, 7)).toString());		
		assertEquals("3_1/3 : 3/7:", "7_7/9", 
				new GemBruch(3, 1, 3).div(
				new GemBruch(3, 7)).toString());		
		assertEquals("3_1/3 : 1_3/7:", "2_1/3", 
				new GemBruch(3, 1, 3).div(
				new GemBruch(1, 3, 7)).toString());						
	}
	
	@Test
	/**
	 * Division negativer Brüche.
	 */
	public void testNegativDivide() {		
		assertEquals("-12 : -3:", "4", 
				new GemBruch(-12).div(
				new GemBruch(-3)).toString());				
		assertEquals("-16 : -3:", "5_1/3", 
				new GemBruch(-16).div(
				new GemBruch(-3)).toString());		
		assertEquals("-3_1/3 : -1_3/7:", "2_1/3", 
				new GemBruch(-3, 1, 3).div(
				new GemBruch(-1, 3, 7)).toString());		
	}

	
	@Test
	/**
	 * Division gemischter Brüche.
	 */
	public void testGemischtDivide() {					
		assertEquals("-16 : 3:", "-5_1/3", 
				new GemBruch(-16).div(
				new GemBruch(3)).toString());				
		assertEquals("3/4 : -2/6:", "-2_1/4", 
				new GemBruch(3, 4).div(
				new GemBruch(-2, 6)).toString());		
		assertEquals("-1/3 : 3/7:", "-7/9", 
				new GemBruch(-1, 3).div(
				new GemBruch(3, 7)).toString());		
		assertEquals("3_1/3 : -3/7:", "-7_7/9", 
				new GemBruch(3, 1, 3).div(
				new GemBruch(-3, 7)).toString());		
		assertEquals("-3_1/3 : 1_3/7:", "-2_1/3", 
				new GemBruch(-3, 1, 3).div(
				new GemBruch(1, 3, 7)).toString());		
		assertEquals("3_1/3 : -1_3/7:", "-2_1/3", 
				new GemBruch(3, 1, 3).div(
				new GemBruch(-1, 3, 7)).toString());
	}

	@Test
	/**
	 * Addition positiver Brüche.
	 */
	public void testPositivAdd() {
		assertEquals("12 + 3:", "15", 
				new GemBruch(12).add(
				new GemBruch(3)).toString());		
		assertEquals("1/3 + 1/3:", "2/3", 
				new GemBruch(1, 3).add(
				new GemBruch(1, 3)).toString());			
		assertEquals("1/3 + 2/3:", "1", 
				new GemBruch(1, 3).add(
				new GemBruch(2, 3)).toString());	
		assertEquals("3/4 + 5/6:", "1_7/12", 
				new GemBruch(3, 4).add(
				new GemBruch(5, 6)).toString());						
		assertEquals("1_3/4 + 2_5/6:", "4_7/12", 
				new GemBruch(1, 3, 4).add(
				new GemBruch(2, 5, 6)).toString());			
	}
	
	@Test
	/**
	 * Addition negativer Brüche.
	 */
	public void testNegativAdd() {		
		assertEquals("-12 + (-3):", "-15", 
				new GemBruch(-12).add(
				new GemBruch(-3)).toString());		
		assertEquals("-1/3 + (-1/3):", "-2/3", 
				new GemBruch(-1, 3).add(
				new GemBruch(-1, 3)).toString());			
		assertEquals("-1/3 + (-2/3):", "-1", 
				new GemBruch(-1, 3).add(
				new GemBruch(-2, 3)).toString());	
		assertEquals("-3/4 + (-5/6):", "-1_7/12", 
				new GemBruch(-3, 4).add(
				new GemBruch(-5, 6)).toString());	
		assertEquals("-1_3/4 + (-2_5/6):", "-4_7/12", 
				new GemBruch(-1, 3, 4).add(
				new GemBruch(-2, 5, 6)).toString());
	}
	
	@Test
	/**
	 * Addition gemischter Brüche.
	 */
	public void testGemischtAdd() {		
		assertEquals("12 + (-3):", "9", 
				new GemBruch(12).add(
				new GemBruch(-3)).toString());			
		assertEquals("1/3 + (-1/3):", "0", 
				new GemBruch(1, 3).add(
				new GemBruch(-1, 3)).toString());					
		assertEquals("-3/4 + 5/6:", "1/12", 
				new GemBruch(-3, 4).add(
				new GemBruch(5, 6)).toString());
		assertEquals("3/4 + (-5/6):", "-1/12", 
				new GemBruch(3, 4).add(
				new GemBruch(-5, 6)).toString());
		assertEquals("-3/4 + 11/12:", "1/6", 
				new GemBruch(-3, 4).add(
				new GemBruch(11, 12)).toString());		
		assertEquals("1_3/4 + (-2_5/6):", "-1_1/12", 
				new GemBruch(1, 3, 4).add(
				new GemBruch(-2, 5, 6)).toString());		
	}

	@Test
	/**
	 * Subtraktion positiver Brüche.
	 */
	public void testPositivSub() {		
		assertEquals("12 - 3:", "9", 
				new GemBruch(12).sub(
				new GemBruch(3)).toString());				
		assertEquals("1/3 - 1/3:", "0", 
				new GemBruch(1, 3).sub(
				new GemBruch(1, 3)).toString());	
		assertEquals("1/3 - 2/3:", "-1/3", 
				new GemBruch(1, 3).sub(
				new GemBruch(2, 3)).toString());	
		assertEquals("3/4 - 5/6:", "-1/12", 
				new GemBruch(3, 4).sub(
				new GemBruch(5, 6)).toString());
		assertEquals("14/4 - 5/6:", "2_2/3", 
				new GemBruch(14, 4).sub(
				new GemBruch(5, 6)).toString());
		assertEquals("1_3/4 - 2_5/6:", "-1_1/12", 
				new GemBruch(1, 3, 4).sub(
				new GemBruch(2, 5, 6)).toString());
		assertEquals("1_3/4 - 2_8/6:", "-1_7/12", 
				new GemBruch(1, 3, 4).sub(
				new GemBruch(2, 8, 6)).toString());						
	}
	
	@Test
	/**
	 * Subtraktion negativer Brüche.
	 */
	public void testNegativSub() {						
		assertEquals("-12 - (-3):", "-9", 
				new GemBruch(-12).sub(
				new GemBruch(-3)).toString());				
		assertEquals("-1/3 - (-1/3):", "0", 
				new GemBruch(-1, 3).sub(
				new GemBruch(-1, 3)).toString());	
		assertEquals("-1/3 - (-2/3):", "1/3", 
				new GemBruch(-1, 3).sub(
				new GemBruch(-2, 3)).toString());	
		assertEquals("-3/4 - (-5/6):", "1/12", 
				new GemBruch(-3, 4).sub(
				new GemBruch(-5, 6)).toString());
		assertEquals("-14/4 - (-5/6):", "-2_2/3", 
				new GemBruch(-14, 4).sub(
				new GemBruch(-5, 6)).toString());
		assertEquals("-1_3/4 - (-2_5/6):", "1_1/12", 
				new GemBruch(-1, 3, 4).sub(
				new GemBruch(-2, 5, 6)).toString());
		assertEquals("-1_3/4 - (-2_8/6):", "1_7/12", 
				new GemBruch(-1, 3, 4).sub(
				new GemBruch(-2, 8, 6)).toString());
	}
	
	@Test
	/**
	 * Subtraktion gemischter Brüche.
	 */
	public void testGemischtSub() {				
		assertEquals("12 - (-3):", "15", 
				new GemBruch(12).sub(
				new GemBruch(-3)).toString());		
		assertEquals("-1_3/4 - 2_5/6:", "-4_7/12", 
				new GemBruch(-1, 3, 4).sub(
				new GemBruch(2, 5, 6)).toString());
		assertEquals("1_3/4 - (-2_5/6):", "4_7/12", 
				new GemBruch(1, 3, 4).sub(
				new GemBruch(-2, 5, 6)).toString());		
	}

	@Test
	/**
	 * Test auf Rechengenauigkeit bei 10000 Additionen.
	 */
	public void testLoop() {
		GemBruch gb = new GemBruch(0);
		GemBruch a  = new GemBruch(1, 3);
		for (int i = 0; i < 10000; i++) {
			gb = gb.add(a);
		}
		assertEquals("Null erwartet:", "0", 
				gb.sub(new GemBruch(3333, 1, 3)).toString());				
	}
	
	@Test
	/**
	 * Test auf veränderte Objekte.
	 */
	public void testImmutable() {		
		GemBruch a = new GemBruch(1, 1, 3);
		GemBruch b = new GemBruch(1, 1, 4);
		{
			a.add(b);
			assertEquals("a.add(b): a veraendert", "1_1/3", a.toString());
			assertEquals("a.add(b): b veraendert", "1_1/4", b.toString());
		}
		{
			a.sub(b);
			assertEquals("a.sub(b): a veraendert", "1_1/3", a.toString());
			assertEquals("a.sub(b): b veraendert", "1_1/4", b.toString());
		}
		{
			a.mul(b);
			assertEquals("a.mul(b): a veraendert", "1_1/3", a.toString());
			assertEquals("a.mul(b): b veraendert", "1_1/4", b.toString());
		}
		{
			a.div(b);
			assertEquals("a.div(b): a veraendert", "1_1/3", a.toString());
			assertEquals("a.div(b): b veraendert", "1_1/4", b.toString());
		}
	}
	
	
}
