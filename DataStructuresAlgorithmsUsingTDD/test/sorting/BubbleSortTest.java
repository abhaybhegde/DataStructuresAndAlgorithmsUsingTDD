package sorting;

import org.testng.Assert;
import org.testng.annotations.Test;


public class BubbleSortTest {

	@Test
	public void testSort() {
		
		BubbleSort sortObj = new BubbleSort();
		int actualArray[] = { 4,1,3,2,5,6,7,9};
		int expectedArray[] = { 1,2,3,4,5,6,7,9 };
		
		sortObj.sort(actualArray);
		
		Assert.assertEquals(actualArray,expectedArray, "Arrays are not equal");
		
	}

}
