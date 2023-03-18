package laba1;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class UnitTestingArray <T> extends Array {
	
	@Test
	public void TestAddFirst() {
		UnitTestingArray<Integer> array=new UnitTestingArray<Integer>();
		array.AddFirst(7);
		array.AddFirst(8);
		assertEquals(8,array.begin.element);
	}

	@Test
	public  void TestAddLast() {
		UnitTestingArray<Integer> array=new UnitTestingArray<Integer>();
		array.AddLast(5);
		array.AddLast(7);
		array.AddLast(6);
		assertEquals(6,array.begin.next.next.element);
	}

	@Test
	public  void TestFindElem1 () {
		UnitTestingArray<Integer> array=new UnitTestingArray<Integer>();
		array.AddFirst(12);
		assertEquals(12,array.FindElem(0).element);
	}
	@Test
	public void TestFindElem2 () {
		UnitTestingArray<Integer> array=new UnitTestingArray<Integer>();
		assertEquals(null,array.FindElem(array.size+1));
	}
	@Test
	public void TestPop1()
	{
		UnitTestingArray<Integer> array=new UnitTestingArray<Integer>();
		array.AddFirst(12);
		array.AddFirst(112);
		assertEquals(12, array.Pop(1).element);
		
	}
	@Test
	public void TestPop2()
	{
		UnitTestingArray<Integer> array=new UnitTestingArray<Integer>();
		array.AddFirst(12);
		array.AddFirst(112);
		assertEquals(112,array.Pop(0).element);
		
	}
	@Test
	public void TestPop3()
	{
		UnitTestingArray<Integer> array=new UnitTestingArray<Integer>();
		array.AddFirst(12);
		array.AddFirst(22);
		array.AddFirst(1112);
		assertEquals(22,array.Pop(1).element);
		
	}
	@Test
	public void TestDelete1()
	{
		UnitTestingArray<Integer> array=new UnitTestingArray<Integer>();
		array.AddFirst(12);
		array.AddFirst(132);
		array.Delete(0);
		assertEquals(12, array.begin.element);
		
	}
	@Test
	public void TestDelete2()
	{
		UnitTestingArray<Integer> array=new UnitTestingArray<Integer>();
		array.AddFirst(12);
		array.AddFirst(123);
		array.AddFirst(1234);
		array.AddFirst(12345);
		array.Delete(3);
		assertEquals(3,array.size);
		
	}
	@Test
	public void TestDelete3()
	{
		UnitTestingArray<Integer> array=new UnitTestingArray<Integer>();
		array.AddFirst(12);
		array.AddFirst(22);
		array.AddFirst(1112);
		array.Delete(1);
		assertEquals(12,array.Pop(1).element);
		
	}
	@Test
	public void TestDelete4()
	{
		UnitTestingArray<Integer> array=new UnitTestingArray<Integer>();
		array.AddFirst(12);
		array.AddFirst(22);
		array.AddFirst(1112);	
		assertEquals(true,array.Delete(2));
		
	}
	@Test
	public void TestDelete5()
	{
		UnitTestingArray<Integer> array=new UnitTestingArray<Integer>();
		array.AddFirst(12);
		array.AddFirst(22);
		array.AddFirst(1112);	
		assertEquals(false,array.Delete(7));
		
	}
}
