package net.gabriel.huffman;

import java.util.HashMap;

public class HuffMain {

	public static void main(String[] args) {
		Reader reader = new Reader();
		Histogram h = new Histogram();
		h.count(reader.wordNumber("MyText.txt"));
		HashMap<Character, Integer> histogram = h.getHist();
//		System.out.println(h);
		
		

	}

}
