package net.gabriel.huffman;

import java.util.HashMap;
import java.util.List;

public class Encode {
	
	public void search(Tree tree) {
		//Work In Progress
		
		if (y instanceof Leaf) {
	
		}
	}
	
	
	
	public static void main(String[] args) {
		Reader reader = new Reader();
		Histogram h = new Histogram();
		h.count(reader.wordNumber("MyText.txt"));
		HashMap<Character, Integer> histogram = h.getHist();
		Tree tree = new Tree();
//		System.out.println(tree.printMap(histogram));
		List<Node> leaves = tree.printMap(histogram);
		tree.setRoot(tree.createTree(leaves));

	}

}
