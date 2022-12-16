package com.example.demo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DemoApplicationTests {
//suma de 3 numeros
	@Test
	public Integer testSum() {
		Integer result = DemoApplication.sum(2,3,5);
		//c.equals(null)
		assertEquals(10, result);
		return result;
	}

	@Test
	@DisplayName("Test Sum fails when first value is null")
	public void testSumNUll() {
		Integer result = DemoApplication.sum(null,3,5);
		assertNotNull(result, "The result cannot be null");
		assertEquals(8, result);
	}

	@Test
	@DisplayName("Test Sum fails when second value is null")
	public void testSumNUll2() {
		Integer result = DemoApplication.sum(6,null,5);
		assertNotNull(result, "The result cannot be null");
		assertEquals(11, result);
	}

	@Test
	@DisplayName("Test Sum fails when third value is null")
	public void testSumNUll3() {

		Integer result = DemoApplication.sum(2,4,null);
		assertNotNull(result, "The result cannot be null");
		assertEquals(6, result);
	}
	// sumar lista
	@Test
	@DisplayName("Test SumLista")
	public void testSumLista() {
		int result4 = DemoApplication.sumarLista(Arrays.asList(1, 4, 1));
		assertEquals(6, result4);
		//return result4;
	}

	//mayores a 10

	@Test
	@DisplayName("Test numbers larger than 10")
	public void testMayores() {
		int[] numbers = {7, 13, 20, 5, 9, 32, 10, 6};
		List<Integer> numbersArray = Arrays.asList(13, 20, 32);
		List<Integer> resultMayores = DemoApplication.largerNumbers(numbers);
		assertNotNull(resultMayores, "The result cannot be null");
		assertEquals(numbersArray, resultMayores);

	}

	//Maximo de los 3 numeros
	// hacer para el caso que sea null de los 3 numeros
	@Test
	@DisplayName("Test maximium between threes numbers")
	public void testMax() {
		Integer result5 = DemoApplication.maximumNumber(2, 8, 5);
		assertNotNull(result5, "The result cannot be null");
		assertEquals(8, result5);
	}

	@Test
	@DisplayName("Test Maximium fails when first value is null")
	public void testMaxNull() {
		Integer result6 = DemoApplication.maximumNumber(null, 2, 5);
		assertNotNull(result6, "The result cannot be null");
		assertEquals(5, result6);
	}

	@Test
	@DisplayName("Test Maximium fails when second value is null")
	public void testMaxNull1() {
		Integer result7 = DemoApplication.maximumNumber(8, 3, null);
		assertNotNull(result7, "The result cannot be null");
		assertEquals(8, result7);
	}

	@Test
	@DisplayName("Test Maximium fails when third value is null")
	public void testMaxNull2() {
		Integer result7 = DemoApplication.maximumNumber(2, 1, null);
		assertNotNull(result7, "The result cannot be null");
		assertEquals(2, result7);
	}

	@Test
	@DisplayName("Test Ascending List")
	public void testAscendingList() {
		int[] list = {8, 7, 9, 4, 5, 3, 6};
		int[] listResult = {3, 4, 5, 6, 7, 8, 9};

		int[] resultAscendingList = DemoApplication.ascendingList(list);
		assertNotNull(resultAscendingList, "The result cannot be null");
		assertArrayEquals(listResult, resultAscendingList);
	}

	// en caso de que todos sean 0
	@Test
	@DisplayName("Test Ascending fails when the whole array is value zero")
	public void testAscendingListNull() {
		int[] list = {0, 0, 0, 0, 0, 0, 0};
		int[] listResult = {0, 0, 0, 0, 0, 0, 0};

		int[] resultAscendingList = DemoApplication.ascendingList(list);
		assertNotNull(resultAscendingList, "The result cannot be null");
		assertArrayEquals(listResult, resultAscendingList);
	}

	@Test
	@DisplayName("Test Descending List")
	public void testDecendingList() {
		int[] list = {8, 7, 9, 4, 5, 3, 6};
		int[] listResult = {9, 8, 7, 6, 5, 4, 3};

		int[] resultAscendingList = DemoApplication.descendingList(list);
		assertNotNull(resultAscendingList, "The result cannot be null");
		assertArrayEquals(listResult, resultAscendingList);
	}

	@Test
	@DisplayName("Test Descending fails when the whole array is value zero")
	public void testADecendingList() {
		int[] list = {0, 0, 0, 0, 0, 0, 0};
		int[] listResult = {0, 0, 0, 0, 0, 0, 0};

		int[] resultAscendingList = DemoApplication.descendingList(list);
		assertNotNull(resultAscendingList, "The result cannot be null");
		assertArrayEquals(listResult, resultAscendingList);
	}

	//


}
