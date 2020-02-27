/**
 * Hunter Dyer, class ID: 352, Assignment #1
 * This java file is the SimpleListTest, which uses junit test cases to see if my methods work. 
 * The testSimpleListAdd and testSimpleListRemove were giving me problems, but everything else had successful tests. 
 */

package assign2;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SimpleListTest {

	/**
	 * This method will just test to see if we can add to the list
	 * I used two lists, both from the SimpleList method, and add 5 to each of them. 
	 * Even though it return back as an error, I'm getting the same thing for failure
	 * Message is "expectedL assign1.SimpleList<5> but was: assign1.SimpleList<5>"
	 * I'm unable to figure out the problem
	 */
	@Test
	public void testSimpleListAdd() {
		SimpleList expectedList = new SimpleList();
		SimpleList actualList = new SimpleList(); 
		expectedList.add(5);
		actualList.add(5);
		assertEquals(expectedList, actualList); 
	}

	/**
	 * This method will test to see if we can remove from the list
	 * I used the same two lists as the previous test.
	 * I added a 5, then removed it. Then added an 8 to both. 
	 * I'm getting the same failure as last time. 
	 * Message is "expectedL assign1.SimpleList<8> but was: assign1.SimpleList<8>"
	 */
	@Test
	public void testSimpleListRemove() {
		SimpleList expectedList = new SimpleList();
		SimpleList actualList = new SimpleList(); 
		expectedList.add(5);
		expectedList.remove(5);
		expectedList.add(8);
		actualList.add(8);
		assertEquals(expectedList, actualList); 
	}
	
	/**
	 * This method tests to see if the counter is working
	 * I added 3 random integers, so I assumed that the counter would be 3
	 * I compared to see if integer 3 actually came out from the count function
	 */
	@Test
	public void testSimpleListCount() {
		SimpleList countList = new SimpleList();
		countList.add(5);
		countList.add(5);
		countList.add(5); 
		assertEquals(3, countList.count());
	}
	
	/**
	 * This method tests to see if the toString method works
	 * The method first made a string with "5 5 5", then made a list with "5 5 5" using the add function
	 * We compared the string with the made list using assertEquals
	 */
	@Test
	public void testSimpleListToString() {
		SimpleList stringList = new SimpleList();
		String expectedString = "5 5 5"; 
		stringList.add(5);
		stringList.add(5);
		stringList.add(5); 
		assertEquals(expectedString, stringList.toString());
	}
	
	/**
	 * This method tests to see if the search method work
	 * I added a bunch of values to a list, in ascending order of 1 to 5
	 * Then I made a value to be compared with in an assertEquals
	 * The search method will return the index of the element, and since array start at 0, the 2nd index is actually 3
	 *  I used an assertEquals to see if the index that the element 3 was stored in, was the same value as 2. 
	 */
	@Test
	public void testSimpleListSearch() {
		SimpleList searchList = new SimpleList();
		int expectedValue = 2; 
		searchList.add(1);
		searchList.add(2);
		searchList.add(3);
		searchList.add(4);
		searchList.add(5);
		assertEquals(expectedValue, searchList.search(3));
	}
}
