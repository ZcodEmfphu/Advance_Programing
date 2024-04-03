package lab4_5_test.lab4;

import static org.junit.Assert.*;

import org.junit.Test;

import lab4_5.lab4.*;

public class Ex5_Test {

	@Test
	public void reverseArray() {
		int[] arr1 = { 1, 4, 6, 8, 3 };
		int[] arr2 = { -1, -4, -6, -8, 3 };
		int[] arr3 = { 0 };

		assertEquals(true, Ex5.contains(1, arr1));
		assertEquals(false, Ex5.contains(1, arr2));
		assertEquals(false, Ex5.contains(1, arr3));
	}

	@Test
	public void findOccurrences() {
		int[] arr1 = { 1, 4, 6, 1, 3 };
		int[] arr2 = { -1, -4, -6, -8, 3 };
		int[] arr3 = { 0 };

		assertEquals("CountX: 2 Pos: [1, 4]", Ex5.findOccurrences(arr1, 1));
		assertEquals("CountX: 1 Pos: [1]", Ex5.findOccurrences(arr2, -1));
		assertEquals("CountX: 0 Pos: []", Ex5.findOccurrences(arr3, 1));

	}

	@Test
	public void removeElements() {
		int[] arr1 = { 1, 4, 6, 1, 3 };
		int[] arr2 = { -1, -4, -6, 3 };
		int[] arr3 = { 0 };

		assertArrayEquals(new int[] { 4, 6, 3 }, Ex5.removeElements(arr1, 1));
		assertArrayEquals(new int[] { -4, -6, 3 }, Ex5.removeElements(arr2, -1));
		assertArrayEquals(new int[] {}, Ex5.removeElements(arr3, 0));

		assertArrayEquals(new int[] { 4, 6, 3 }, Ex5.removeElements2(arr1, 1));
		assertArrayEquals(new int[] { -4, -6, 3 }, Ex5.removeElements2(arr2, -1));
		assertArrayEquals(new int[] {}, Ex5.removeElements2(arr3, 0));
	}

}
