/*Returns null, prints a countdown from 10 to the terminal and stops when it hits int total == 0.
*Program designed to demonstrate competence with 'if' expression and 'while' loop.
*
*Program takes no meaningful input.
*@param String[] required param
*@param args required param
*@return void returns nothing
*/


public class If_Demo {
	public static void main (String[] args) {
		int total = 10;
		while (total > 0) {
			if (total == 1) {
				System.out.println("And 1 is done!");
				total = total - 1; 
			}
			else {
				System.out.println(total + " remaining loops!");
				total = total - 1;			
			}
		}
	}
}