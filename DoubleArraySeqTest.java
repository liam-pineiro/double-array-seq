package doubleArraySeq;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class DoubleArraySeqTest {

	@Test
	public void capacityTest1() {
		DoubleArraySeq test1 = new DoubleArraySeq();
		assert(test1.toString().equals(""));
	}
	
	@Test
	public void capacityTest2() {
		DoubleArraySeq test1 = new DoubleArraySeq(200);
		assert(test1.toString().equals(""));
	}
	
	@Test
	public void currentTest1() {
		DoubleArraySeq test1 = new DoubleArraySeq();
		assertFalse(test1.isCurrent());
	}
	
	@Test
	public void addBeforeTest1() {
		DoubleArraySeq test1 = new DoubleArraySeq();
		test1.addBefore(60.0);
		assert(test1.toString().equals("60.0"));
	}
	
	@Test
	public void addBeforeTest2() {
		DoubleArraySeq test1 = new DoubleArraySeq();
		test1.addBefore(60.0);
		test1.addBefore(50.0);
		assert(test1.toString().equals("50.0, 60.0"));
	}
	
	@Test
	public void addBeforeTest3() {
		DoubleArraySeq test1 = new DoubleArraySeq(1);
		test1.addBefore(60.0);
		test1.addBefore(50.0);
		assert(test1.toString().equals("50.0, 60.0"));
	}
	
	@Test
	public void addBeforeTest4() {
		DoubleArraySeq test1 = new DoubleArraySeq();
		test1.addBefore(60.0);
		test1.addBefore(50.0);
		test1.addBefore(40.0);
		assert(test1.toString().equals("40.0, 50.0, 60.0"));
	}
	
	@Test
	public void addBeforeTest5() {
		DoubleArraySeq test1 = new DoubleArraySeq();
		test1.addBefore(60.0);
		test1.addBefore(50.0);
		test1.addBefore(40.0);
		test1.addBefore(30.0);
		assert(test1.toString().equals("30.0, 40.0, 50.0, 60.0"));
	}
	
	@Test
	public void removeCurrentTest1() {
		DoubleArraySeq test1 = new DoubleArraySeq();
		test1.addBefore(60.0);
		test1.removeCurrent();
		assertFalse(test1.isCurrent());
	}
	
	@Test
	public void removeCurrentTest2() {
		DoubleArraySeq test1 = new DoubleArraySeq();
		test1.addBefore(60.0);
		test1.addBefore(30.0);
		test1.addAfter(90.0);
		assert(test1.toString().equals("30.0, 90.0, 60.0"));
		test1.removeCurrent();
		assertEquals(test1.getCurrent(), 60.0);
	}
	
	@Test
	public void removeCurrentTest3() {
		DoubleArraySeq test1 = new DoubleArraySeq();
		test1.addBefore(60.0);
		test1.addBefore(40.0);
		test1.addAfter(50.0);
		test1.addBefore(20.0);
		assert(test1.toString().equals("40.0, 20.0, 50.0, 60.0"));
		test1.removeCurrent();
		
	}
	
	
	@Test
	public void sizeTest1() {
		DoubleArraySeq test1 = new DoubleArraySeq();
		test1.addBefore(60.0);
		test1.addBefore(50.0);
		test1.addBefore(40.0);
		test1.addBefore(30.0);
		assertEquals(test1.size(), 4);
	}
	
	@Test
	public void getCurrentTest1() {
		DoubleArraySeq test1 = new DoubleArraySeq();
		test1.addBefore(60.0);
		test1.addBefore(50.0);
		test1.addBefore(40.0);
		test1.addBefore(30.0);
		assertEquals(test1.getCurrent(), 30.0);
	}
	
	@Test
	public void addAllTest1() {
		DoubleArraySeq test1 = new DoubleArraySeq();
		test1.addBefore(60.0);
		test1.addBefore(50.0);
		test1.addBefore(40.0);
		test1.addBefore(30.0);
		DoubleArraySeq test2 = new DoubleArraySeq();
		test2.addBefore(60.0);
		test2.addBefore(50.0);
		test2.addBefore(40.0);
		test2.addBefore(30.0);
		test1.addAll(test2);
		assert(test1.toString().equals("30.0, 40.0, 50.0, 60.0, 30.0, 40.0, 50.0, 60.0"));
	}
	
	@Test
	public void addAfterTest1() {
		DoubleArraySeq test1 = new DoubleArraySeq();
		test1.addBefore(60.0);
		test1.addAfter(50.0);
		assert(test1.toString().equals("60.0, 50.0"));
	}
	
	@Test
	public void addAfterTest2() {
		DoubleArraySeq test1 = new DoubleArraySeq();
		test1.addAfter(50.0);
		assert(test1.toString().equals("0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 50.0"));
	}
	
	@Test
	public void addAfterTest3() {
		DoubleArraySeq test1 = new DoubleArraySeq();
		test1.addAfter(50.0);
		test1.addBefore(60.0);
		assert(test1.toString().equals("0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 60.0, 50.0"));
	}
	
	
	@Test
	public void addAfterTest4() {
		DoubleArraySeq test1 = new DoubleArraySeq();
		test1.addBefore(60.0);
		test1.addBefore(50.0);
		test1.addAfter(40.0);
		assert(test1.toString().equals("50.0, 40.0, 60.0"));
	}
	
	@Test
	public void addAfterTest5() {
		DoubleArraySeq test1 = new DoubleArraySeq(2);
		test1.addBefore(60.0);
		test1.addBefore(50.0);
		test1.addAfter(40.0);
		assert(test1.toString().equals("50.0, 40.0, 60.0"));
	}
	
	@Test
	public void addAfterTest6() {
		DoubleArraySeq test1 = new DoubleArraySeq();
		test1.addAfter(50.0);
		test1.addBefore(60.0);
		test1.addBefore(40.0);
		assert(test1.toString().equals("0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 40.0, 60.0, 50.0"));
	}
	
	@Test
	public void addAfterTest7() {
		DoubleArraySeq test1 = new DoubleArraySeq();
		test1.addAfter(50.0);
		test1.addBefore(60.0);
		test1.addBefore(40.0);
		test1.addBefore(20.0);
		assert(test1.toString().equals("0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 20.0, 40.0, 60.0, 50.0"));
	}
	
	@Test
	public void testAdvance1() {
		DoubleArraySeq test1 = new DoubleArraySeq();
		test1.addAfter(60.0);
		test1.advance();
		assertFalse(test1.isCurrent());
	}
	
	@Test
	public void testAdvance2() {
		DoubleArraySeq test1 = new DoubleArraySeq();
		test1.addBefore(40.0);
		test1.addBefore(20.0);
		test1.advance();
		assertEquals(test1.getCurrent(), 40.0);
	}
	
	
	@Test
	public void testCatenation1() {
		DoubleArraySeq test1 = new DoubleArraySeq();
		DoubleArraySeq test2 = new DoubleArraySeq();
		DoubleArraySeq test3 = new DoubleArraySeq();
		
		test2.addBefore(60.0);
		test3.addBefore(70.0);
		
		DoubleArraySeq test4 = test1.catenation(test2, test3);
		
		assert(test4.toString().equals("60.0, 70.0"));
	}
	
	@Test
	public void testCatenation2() {
		DoubleArraySeq test1 = new DoubleArraySeq();
		DoubleArraySeq test2 = new DoubleArraySeq();
		DoubleArraySeq test3 = new DoubleArraySeq();
		
		test2.addBefore(60.0);
		test3.addAfter(70.0);
		
		DoubleArraySeq test4 = test1.catenation(test2, test3);
		
		assert(test4.toString().equals("60.0, 70.0"));
		assertFalse(test4.isCurrent());
	}
	
	@Test
	public void testCatenation3() {
		DoubleArraySeq test1 = new DoubleArraySeq();
		DoubleArraySeq test2 = new DoubleArraySeq();
		DoubleArraySeq test3 = new DoubleArraySeq();
		
		test2.addBefore(60.0);
		test2.addAfter(50.0);
		test3.addAfter(70.0);
		test3.addBefore(20.0);
		
		DoubleArraySeq test4 = test1.catenation(test2, test3);
		
		assert(test4.toString().equals("60.0, 50.0, 20.0, 70.0"));
	}
	
	@Test
	public void testCatenation4() {
		DoubleArraySeq test1 = new DoubleArraySeq();
		DoubleArraySeq test2 = new DoubleArraySeq();
		DoubleArraySeq test3 = new DoubleArraySeq();
		
		test2.addAfter(50.0);
		test3.addAfter(70.0);
		
		DoubleArraySeq test4 = test1.catenation(test2, test3);
		
		assert(test4.toString().equals("50.0, 70.0"));
	}
	
	@Test
	public void testCatenation5() {
		DoubleArraySeq test1 = new DoubleArraySeq();
		DoubleArraySeq test2 = new DoubleArraySeq();
		DoubleArraySeq test3 = new DoubleArraySeq();
		
		test2.addAfter(50.0);
		test3.addBefore(20.0);
		test3.addAfter(70.0);
		
		DoubleArraySeq test4 = test1.catenation(test2, test3);
		
		assert(test4.toString().equals("50.0, 20.0, 70.0"));
	}
}
