/**
 * 
 * @author Nova Robb
 * CEN 3024
 */

package application;

/**
 * Class contains stats about a word occurrence and implements the Comparable interface
 */
class WordStat implements Comparable<WordStat> {
	 public String word;
	 public int count;
		
	/**
	 * Method compares WordStat objects based on their count
	 */
	 public int compareTo(WordStat ws) {
		 if (count == ws.count) {
			 return 0;
		 } else if (count > ws.count) {
			 return 1;
		 } else {
			 return -1;
		 }
	 }

	 /**
	  * Method prints out the getPrintable method
	  */
	 public void print() {
		 System.out.println(getPrintable());
	 }
	
	 /**
	  * Method formats the string for output
	  * @return Returns a formatted string
	  */
	 public String getPrintable() {
		 return String.format("Word: %-12sFrequency: %d", "\""+ word+ "\"", count);
	 }
}