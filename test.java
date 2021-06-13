import java.util.LinkedList;
import java.util.List;

/**
 * test.java created by james on Surface Pro in CS540P5
 *
 * Author:		James Zhang (jzhang924@wisc.edu)
 * Date: 		@date
 * 
 * Course:		CS400
 * Semester: 	Spring 2020
 * Lecture: 	001
 * 
 * IDE: 		Eclipse IDE for Java Developers 
 * 
 * List Collaborators:	NONE
 * 
 * Other Credits: 		NONE
 * 
 * Known Bugs:	describe known unresolved bugs here
 */

/**
 * test - TODO Describe purpose of this user-defined type
 * 
 * @author zhang (2020)
 *
 */
public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(6 / 2);

		LinkedList<String> testStr = new LinkedList<>();


		testStr.add(0,"2");
		testStr.add("3");
		testStr.add("4");
		testStr.add(0,"5");

		System.out.println(testStr);

		System.out.println(testStr.pop());

	}

}
