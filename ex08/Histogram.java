import java.util.HashMap;
/**
 * 
 *
 */
public class Histogram {
	private HashMap<Character, Integer> histogram = new HashMap<Character, Integer>();
	public String toString() {
		return histogram.toString();
	}
	
	public void count(Character c) {
		if (histogram.containsKey(c)) {
			histogram.put(c, histogram.get(c) + 1);
		}
		else {
			histogram.put(c, 1);
		}
	}
	
	public void count(String s) {
		Character c;
		for (int i = 0; i < s.length(); i++){
		    c = s.charAt(i);
		    count(c);
		}
	}
	
	public int freq(Character c) {
		return histogram.get(c);
	}
	

	public static void main(String[] args) {
		 Histogram h = new Histogram();
		 h.count("time flies");
		 if (h.freq('i') == 2) {
		 	System.out.println("pass");
		 }
		 else {
		 	System.out.println("fail");
		 }

		 if (h.toString() !=  "{ =1, s=1, t=1, e=2, f=1, i=2, l=1, m=1}") {
		 	System.out.println("pass");
		 }
		 else {
		 	System.out.println("fail");
		 }
		 System.out.println(h);

	}

}