package com.rlembcke.tasker;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


class MysqlApplicationTests {

	@Test
	void test() {
		List<Integer> num1 = List.of(1, 2, 10, 20);
		List<Integer> num2 = List.of(2, 6, 15, 19);

		// [1, 2, 2, 6, 10, 15 , 19, 20] = 6+10/2 = 8.0

		List<Integer> allElements = new ArrayList<>();
		allElements.addAll(num1);
		allElements.addAll(num2);
		Collections.sort(allElements);

		Integer middleIndex = (allElements.size() / 2) -1;
		Double median = (allElements.get(middleIndex) + allElements.get(++middleIndex)) / 2.0;

		Assert.isTrue(median.equals(8.0));





	}

}
